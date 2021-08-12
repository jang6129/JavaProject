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
//		this.number = (int) (Math.random() * (99999 - 10000 + 1)) + 10000;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
	
	public Student(String name, String major, int grade, int number) {
		this.number = number;
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
	
	public int getStudentNumber() {
		return number;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public String getStudentMajor() {
		return major;
	}
	
	public int getStudentGrade() {
		return grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
