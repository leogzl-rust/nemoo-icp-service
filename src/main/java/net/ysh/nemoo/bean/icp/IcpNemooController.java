package net.ysh.nemoo.bean.icp;

import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;

import org.ic4j.agent.Agent;
import org.ic4j.agent.AgentBuilder;
import org.ic4j.agent.ProxyBuilder;
import org.ic4j.agent.ReplicaTransport;
import org.ic4j.agent.http.ReplicaApacheHttpTransport;
import org.ic4j.types.Principal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IcpNemooController {

	@Value("${nemoo.icp.location}")
	private String location;

	@Value("${nemoo.icp.canister}")
	private String canister;

	public String getCommand() throws URISyntaxException {
		ReplicaTransport transport = ReplicaApacheHttpTransport.create(location);
		Agent agent = new AgentBuilder().transport(transport).build();

		IcpNemooProxy nemooProxy = ProxyBuilder.create(agent, Principal.fromString(canister)).getProxy(IcpNemooProxy.class);

		CompletableFuture<String> proxyResponse = nemooProxy.getCommand();

		String output = proxyResponse.get();

		return output;
	}

//	public static void main(String[] args) {
//		try {
//			System.out.println(getVersion());
//
//			InputStream propInputStream = IcpNemooController.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
//
//			Properties env = new Properties();
//			env.load(propInputStream);
//
//			String icLocation = "https://icp-api.io/";
//			String icCanister = "56ava-4qaaa-aaaal-qcmma-cai";
//
//			System.out.println("  >>>> LOCATION: " + icLocation);
//			System.out.println("  >>>> CANISTER: " + icCanister);
//
//			ReplicaTransport transport = ReplicaApacheHttpTransport.create(icLocation);
//			Agent agent = new AgentBuilder().transport(transport).build();
//
//			IcpNemooProxy helloWorldProxy = ProxyBuilder.create(agent, Principal.fromString(icCanister)).getProxy(IcpNemooProxy.class);
//
//			String value = "world";
//
//			CompletableFuture<String> proxyResponse = helloWorldProxy.greet(value);
//
//			String output = proxyResponse.get();
//			LOG.info(output);
//
//		} catch (Throwable e) {
//			// LOG.error(e.getLocalizedMessage(), e);
//			e.printStackTrace();
//		}
//	}

}
