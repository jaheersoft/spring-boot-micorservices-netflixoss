package com.expenses.account.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@Id 
	@Length(min = 1, max = 50)
	@Column(name="name")
	private String name;

	@Column(name="lastSeen")
	private Date lastSeen;

	@Valid
	@OneToMany(cascade = CascadeType.ALL,mappedBy="account")
	private List<Item> incomes;

	@Valid
	@OneToMany(cascade = CascadeType.ALL,mappedBy="account")
	private List<Item> expenses;

	@Valid
	@NotNull
	@OneToOne(cascade = CascadeType.ALL,mappedBy="account")
	private Saving saving;

	@Length(min = 0, max = 10_000)
	@Column(name="note")
	private String note;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public List<Item> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<Item> incomes) {
		this.incomes = incomes;
	}

	public List<Item> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Item> expenses) {
		this.expenses = expenses;
	}

	public Saving getSaving() {
		return saving;
	}

	public void setSaving(Saving saving) {
		this.saving = saving;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
