package com.springboot.rpc.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Appliation {
	
	private static Logger logger = LoggerFactory.getLogger(Appliation.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Appliation.class, args);
		logger.info(" application start successfully ");
	}
}
