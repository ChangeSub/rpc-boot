package com.springboot.rpc.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import com.springboot.rpc.interfaces.RpcInterface;
import com.springboot.rpc.interfaces.UserInfoService;

@Configuration
public class RMIClientConfig {

	
	@Bean(name = "rpcInterface")
	public RmiProxyFactoryBean initRmiProxyFactoryBean() {
		
		RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
		factoryBean.setServiceUrl("rmi://127.0.0.1:1099/rpcInterface");
		factoryBean.setServiceInterface(RpcInterface.class);
		return factoryBean;
	}
	
	@Bean//(name = "userInfoService")
	public RmiProxyFactoryBean inituserInfoService() {
		
		RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
		factoryBean.setServiceUrl("rmi://127.0.0.1:66666/userInfoService");
		factoryBean.setServiceInterface(UserInfoService.class);
		return factoryBean;
	}
}
