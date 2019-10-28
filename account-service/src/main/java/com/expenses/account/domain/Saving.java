package com.expenses.account.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@Entity
@Table(name = "saving")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Saving {
	
	@Id
	@NotNull
	@Length(min = 1, max = 50)
	@Column(name="savingid")
	private String savingid;
	
	@NotNull
	@Column(name="amount")
	private BigDecimal amount;

	@NotNull
	@Column(name="currency")
	private Currency currency;

	@NotNull
	@Column(name="interest")
	private BigDecimal interest;

	@NotNull
	@Column(name="deposit")
	private Boolean deposit;

	@NotNull
	@Column(name="capitalization")
	private Boolean capitalization;
	
	@OneToOne
	@JoinColumn(name = "name")
	private Account account;

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

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Boolean getDeposit() {
		return deposit;
	}

	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}

	public Boolean getCapitalization() {
		return capitalization;
	}

	public void setCapitalization(Boolean capitalization) {
		this.capitalization = capitalization;
	}

	public String getSavingid() {
		return savingid;
	}

	public void setSavingid(String savingid) {
		this.savingid = savingid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
