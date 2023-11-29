package net.ysh.nemoo.service;

import org.ic4j.agent.Agent;
import org.ic4j.agent.AgentBuilder;
import org.ic4j.agent.ProxyBuilder;
import org.ic4j.agent.ReplicaTransport;
import org.ic4j.agent.http.ReplicaApacheHttpTransport;
import org.ic4j.types.Principal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import net.ysh.nemoo.bean.icp.Fish;
import net.ysh.nemoo.bean.icp.Fisher;

@Component
public class IcpNemooController {

	public static final String GET_ICP_COMMAND = "getIcpCommand";

	public static final String COMMAND_GET_FISH = "getFish";
	public static final String COMMAND_SAVE_FISH = "saveFish";

	public static final String COMMAND_GET_FISHER = "getFisher";
	public static final String COMMAND_SAVE_FISHER = "saveFisher";

	@Value("${nemoo.icp.location}")
	private String location;

	@Value("${nemoo.icp.canister}")
	private String canister;

	private IcpNemooProxy createProxy() throws Exception {
		ReplicaTransport transport = ReplicaApacheHttpTransport.create(location);
		Agent agent = new AgentBuilder().transport(transport).build();

		return ProxyBuilder.create(agent, Principal.fromString(canister)).getProxy(IcpNemooProxy.class);
	}

	public String getCommand() throws Exception {
		return createProxy().getCommand().get();
	}

	public Fish getFish(String fishId) throws Exception {
		return createProxy().getFish(fishId).get();
	}

	public String saveFish(Fish fish) throws Exception {
		return createProxy().saveFish(fish).get();
	}

	public Fisher getFisher(String fisherId) throws Exception {
		return createProxy().getFisher(fisherId).get();
	}

	public String saveFisher(Fisher fisher) throws Exception {
		return createProxy().saveFisher(fisher).get();
	}
}
