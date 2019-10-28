package com.expenses.account.domain;

//import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class User {

	@NotNull
	//@Length(min = 3, max = 20)
	private String username;

	@NotNull
	//@Length(min = 6, max = 40)
	private String password;
	
	private boolean isActive;
	
	private String roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}
