package com.springboot.rpc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.springboot.rpc.interfaces.HessianSevice;

@Configuration
public class HessianSeviceRpcConfig {

	@Autowired  
	private HessianSevice hessianSevice;
	
	@Bean(name = "/hessianSevice")
	public HessianServiceExporter initHessianService(){
		
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(hessianSevice);
		exporter.setServiceInterface(HessianSevice.class);
		return exporter;
	}
}
