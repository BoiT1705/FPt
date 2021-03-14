/*
 * (C) Copyright 2021 Fresher Academy. All Rights Reserved.
 *
 * @author 4Quang
 * @date Mar 12, 2021
 * @version 1.0
 */

package com.trungtamjava.model;

public class Order {
	private Person person;

	public Order(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
