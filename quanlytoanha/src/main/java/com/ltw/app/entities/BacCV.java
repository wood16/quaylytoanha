package com.ltw.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "BacCV")
public class BacCV {
	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "heSoBac")
	private Integer heSoBac;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHeSoBac() {
		return heSoBac;
	}

	public void setHeSoBac(Integer heSoBac) {
		this.heSoBac = heSoBac;
	}
	
	
}
