package com.springboot.rpc.impl;

import org.springframework.stereotype.Service;

import com.springboot.rpc.interfaces.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Override
	public String getUserName() {
		return "getUserName method";
	}

}
