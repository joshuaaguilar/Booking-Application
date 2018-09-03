package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Authentication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authenticationId;
	@OneToOne
	private Customer customer;

	public int getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(int authenticationId) {
		this.authenticationId = authenticationId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
