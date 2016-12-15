package com.ycm_api.business.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "s_user", catalog = "ycm")
public class SUser implements java.io.Serializable {

	private static final long serialVersionUID = 5470834602321079279L;
	
	// Fields
	private Long id;
	private String name;
	private String password;

	// Constructors

	/** default constructor */
	public SUser() {
	}

	/** full constructor */
	public SUser(String name, String password) {
		this.name = name;
		this.password = password;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}