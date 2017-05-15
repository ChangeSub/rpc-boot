package com.springboot.rpc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.springboot.rpc.interfaces.RpcInterface;
import com.springboot.rpc.interfaces.UserInfoService;

@Configuration
public class RMIConfig {

	@Autowired  
    private RpcInterface rpcInterface;  
	
	@Autowired  
	private UserInfoService userInfoService;
   
    @Bean  
    public RmiServiceExporter initRmiServiceExporter(){  
    	
        RmiServiceExporter exporter=new RmiServiceExporter();  
        exporter.setServiceInterface(RpcInterface.class);  
        exporter.setServiceName("rpcInterface"); //调用时此名称查找 
        exporter.setService(rpcInterface);  
//        exporter.setServicePort(6666);  端口设置无效 默认为1099
        return exporter;  
    }  
    
    @Bean//(name = "userInfoServiceRmi")  
    public RmiServiceExporter initUserInfoService(){  
    	
        RmiServiceExporter exporter=new RmiServiceExporter();  
        exporter.setServiceInterface(UserInfoService.class);  
        exporter.setServiceName("userInfoService"); //调用时此名称查找 
        exporter.setService(userInfoService);  
        exporter.setRegistryPort(6666);  
        return exporter;  
    }  
}
