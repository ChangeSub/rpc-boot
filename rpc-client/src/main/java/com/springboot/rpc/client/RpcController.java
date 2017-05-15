package com.springboot.rpc.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rpc.interfaces.RpcInterface;
import com.springboot.rpc.interfaces.UserInfoService;

@RestController
public class RpcController {

	@Autowired
	private RpcInterface rpcInterface;
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("index")
	public String index(){
		
		return rpcInterface.sayHi("james");
	}
	
	@RequestMapping("user")
	public String user(){
		
		return userInfoService.getUserName();
	}
}
