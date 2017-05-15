package com.springboot.rpc.impl;

import org.springframework.stereotype.Service;

import com.springboot.rpc.interfaces.RpcInterface;

@Service
public class RpcInterfaceImpl implements RpcInterface {

	@Override
	public String sayHi(String name) {
		return "Hi : " + name;
	}
}
