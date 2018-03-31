package com.in28minutes.microservices.limitsservice;

public class LimitsConfiguration {
	
	public int maximum;
	public int minimum;
	
	
	public LimitsConfiguration() {
		super();
	}


	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}


	public int getMaximum() {
		return maximum;
	}


	public int getMinimum() {
		return minimum;
	}
	
	
	
}
