package com.springboot.rpc.client;

import java.net.MalformedURLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.caucho.hessian.client.HessianProxyFactory;
import com.springboot.rpc.interfaces.HessianSevice;

@Configuration
public class HessianSeviceClient {

	@Bean
	public HessianSevice initRmiProxyFactoryBean() throws MalformedURLException {

		String url = "http://localhost:8080/hessianSevice";    
        HessianProxyFactory factory = new HessianProxyFactory();    
        HessianSevice hessianSevice = (HessianSevice) factory.create(HessianSevice.class, url);    
        return hessianSevice;
	}
}
