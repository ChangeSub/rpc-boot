package com.springboot.rpc.impl;

import org.springframework.stereotype.Service;

import com.springboot.rpc.interfaces.HessianSevice;

@Service
public class HessianServiceExporterImpl implements HessianSevice{

	@Override
	public String hessianService() {
		return "HessianSevice";
	}
}
