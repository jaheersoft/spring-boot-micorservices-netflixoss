package com.expenses.auth.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//import org.hibernate.validator.constraints.Length;

//@Document(collection = "users")
@Entity
@Table(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User /*implements UserDetails*/ {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 * 
	 * @Column private long id;
	 */
	
	@Id
	@Column
	@NotNull
	//@Length(min = 3, max = 20)
	private String username;

	@Column
	@NotNull
	//@Length(min = 6, max = 40)
	private String password;
	
	@Column
	private boolean isActive;
	
	@Column
	private String roles;
	
	/*
	 * public long getId() { return id; } public void setId(long id) { this.id = id;
	 * }
	 */
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
