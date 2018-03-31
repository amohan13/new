package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionmultiple;
	
	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionmultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionmultiple = conversionmultiple;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}
	
	

}
