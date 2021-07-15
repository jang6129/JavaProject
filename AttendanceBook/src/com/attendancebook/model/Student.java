package com.attendancebook.model;

import java.util.Random;

public class Student {
	int number;
	String name;
	String major;
	int grade;
	boolean isEmpty;
	public Student() {
		isEmpty = true;
	}
	public Student(String name, String major, int grade) {
		Random random = new Random();
		this.number = random.nextInt();
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	public void introduceMyself() {
		System.out.println(number + "\n" + name + "\n" + major + "\n" + grade);
	}
	
	public boolean isEmpty() {
		return this.isEmpty;
	}
}
