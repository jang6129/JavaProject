package com.attendancebook.model;

import java.util.Random;

public class Student implements Comparable<Student> {
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
		this.number = random.nextInt(1000);
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

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}
