/*
 * (C) Copyright 2021 Fresher Academy. All Rights Reserved.
 *
 * @author 4Quang
 * @date Mar 12, 2021
 * @version 1.0
 */

package com.trungtamjava.model;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println("Khoi tao bean");
	}
	
	public void destroy() {
		System.out.println("Bean da bi huy");
	}
}
