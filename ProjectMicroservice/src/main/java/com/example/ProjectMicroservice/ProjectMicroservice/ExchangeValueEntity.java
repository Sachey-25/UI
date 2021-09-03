package com.example.ProjectMicroservice.ProjectMicroservice;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exchange_value")
public class ExchangeValueEntity {
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal convert;
	private int port;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvert() {
		return convert;
	}
	public void setConversionMultiple(BigDecimal convert) {
		this.convert = convert;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ExchangeValueEntity(Long id, String from, String to, BigDecimal convert, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convert = convert;
		this.port = port;
	}	
}
