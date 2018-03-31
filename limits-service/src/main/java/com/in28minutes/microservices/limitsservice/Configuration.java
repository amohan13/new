package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	public int maximum;
	public int minimum;
	
	
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	

}
