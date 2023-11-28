package net.ysh.nemoo.bean.icp;

import java.util.concurrent.CompletableFuture;

import org.ic4j.agent.annotations.Argument;
import org.ic4j.agent.annotations.UPDATE;
import org.ic4j.agent.annotations.Waiter;
import org.ic4j.candid.annotations.Name;
import org.ic4j.candid.types.Type;

public interface IcpNemooProxy {

	@UPDATE
	@Name("get_command")
	@Waiter(timeout = 30)
	public CompletableFuture<String> getCommand();

	// public CompletableFuture<String> getCommand(@Argument(Type.TEXT)String name);

}
