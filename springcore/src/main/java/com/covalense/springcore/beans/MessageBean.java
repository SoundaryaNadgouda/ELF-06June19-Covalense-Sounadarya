package com.covalense.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;

import lombok.extern.java.Log;

@Log
@Configuration
public class MessageBean {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
@PostConstruct
public void init() {
	log.info("Initializing phase");
}
@PreDestroy
public void destroy() {
	log.info("Destroy phase");
}
}
