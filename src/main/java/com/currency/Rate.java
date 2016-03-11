package com.currency;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class Rate {
	private Integer id;
	private DateTime date;
	private BigDecimal value;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}


}
