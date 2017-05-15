package com.springboot.rpc.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rpc.interfaces.HessianSevice;

@RestController
public class HessianSeviceController {

	@Autowired
	private HessianSevice hessianSevice;
	
	@RequestMapping("hessian")
	public String hessian(){
		
		return hessianSevice.hessianService();
	}
}
