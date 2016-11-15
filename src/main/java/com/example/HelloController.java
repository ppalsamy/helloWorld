package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String getGreeting(){
		LOGGER.info("inside getGreetings()  ");
		return "Hello World!";
	}
	
	@RequestMapping(value="/greeting/{user}", method = RequestMethod.GET)
	public String getUserGreeting(@PathVariable String user){
		LOGGER.info("inside getUserGreetings()  ");
		return String.format("Hello %1s!",user);
	}
}
