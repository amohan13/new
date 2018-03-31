package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsservicecontroller {
	@Autowired
	public Configuration configuration;
	@GetMapping("/limit")
	public LimitsConfiguration  getconfiguration()
	{
		
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
