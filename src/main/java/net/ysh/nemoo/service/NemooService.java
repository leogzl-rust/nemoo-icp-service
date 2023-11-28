package net.ysh.nemoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.ysh.nemoo.logic.BajoBusinessLogic;
import net.ysh.util.LLog;

@Component
public class NemooService {

	@Autowired
	private BajoBusinessLogic businessLogic;

	public NemooService() {
		System.out.println("BajoService.BajoService()");
		LLog.info("BajoService.BajoService()");
	}

}
