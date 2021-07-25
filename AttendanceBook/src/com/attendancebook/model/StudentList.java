package com.attendancebook.model;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studentList;

	public StudentList() {
		this.studentList = new ArrayList<>();
	}

	public Student get(int index) {
		return studentList.get(index);
	}

	public void add(String name, String major, int grade) {
		Student student = new Student(name, major, grade);
		studentList.add(student);
	}

	public void remove(int number) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).number == number) {
				studentList.remove(i);
				return;
			}
		}
	}

	public void update(int number, String major, int grade) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				student.major = major;
				student.grade = grade;
				studentList.set(i, student);
			}
		}
	}

	public void updateName(int number, String name) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				student.name = name;
			}
		}
	}

	public void updateMajor(int number, String major) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				student.major = major;
			}
		}
	}

	public void updateGrade(int number, int grade) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				student.grade = grade;
			}
		}
	}

	public Student search(int number) {
		Student emptyStudent = new Student();
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				return student;
			} else {
				System.out.println("해당 학번의 학생이 존재하지 않습니다.\n");
			}
		}
		return emptyStudent;
	}

	public  int getSize() {
		return studentList.size();
	}
}
