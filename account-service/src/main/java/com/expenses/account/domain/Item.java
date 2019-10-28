package com.expenses.account.domain;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "item")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	@Id
	@NotNull
	@Length(min = 1, max = 50)
	@Column(name="title")
	private String title;

	@NotNull
	@Column(name="amount")
	private BigDecimal amount;

	@NotNull
	@Column(name="currency")
	private Currency currency;

	@NotNull
	@Column(name="period")
	private TimePeriod period;

	@NotNull
	@Column(name="icon")
	private String icon;
	
	@ManyToOne
    @JoinColumn(name = "name")
	private Account account;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public TimePeriod getPeriod() {
		return period;
	}

	public void setPeriod(TimePeriod period) {
		this.period = period;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
