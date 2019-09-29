package com.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	private static Logger logger = LoggerFactory.getLogger(DockerController.class);

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String showLoginPage() {
		logger.info("Docker-demo test Success!!");
		return "Docker-demo test Success for Docker Auto build image!!!";
	}
	
}
