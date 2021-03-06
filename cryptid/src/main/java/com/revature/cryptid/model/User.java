package com.revature.cryptid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "USER")
public class User implements Serializable {

	
	private static final long serialVersionUID = -4438425763999252706L;

	public User(@NotNull String firstname, @NotNull String lastname, @NotNull String email,
			@NotNull String username, String picture) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.picture = picture;
	}
	
	public User(int id, @NotNull String email, @NotNull String firstname, @NotNull String lastname,
			@NotNull String username, String picture) {
		super();
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.picture = picture;
		
	}

	public User(int id) {
		super();
		this.id = id;
	}


	public User() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@NotNull
	private String firstname;

	@Column
	@NotNull
	private String lastname;

	@Column
	@NotNull
	private String email;

	@Column
	@NotNull
	private String username;

	@Column
	private String picture;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", username=" + username + ", picture=" + picture + "]";
	}

}