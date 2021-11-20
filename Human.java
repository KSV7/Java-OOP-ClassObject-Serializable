package com.gmail.kutepov89.sergey;

import java.io.Serializable;

public class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	int age;
	char sex;

	Human(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return (" Name - " + name + " Age - " + age + " Sex - " + String.valueOf(sex));
	}
}