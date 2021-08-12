package com.attendancebook.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	ArrayList<Student> studentList;

	public StudentList() {
		this.studentList = new ArrayList<>();
	}

	public Student get(int index) {
		return studentList.get(index);
	}

	public void add(Student student) {
		studentList.add(student);
		if (studentList.size() == 5) {
			Collections.sort(studentList);
			for (int i = 0; i < 5; i++) {
				get(i).setNumber(210000 + i);
			}
		}
	}

	public void remove(int number) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).number == number) {
				studentList.remove(i);
				return;
			}
		}
	}

	public void update(int number, String name, String major, int grade) {
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);

			if (student.number == number) {
				student.name = name;
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
				return emptyStudent;
			}
		}
		return emptyStudent;
	}

	public int getSize() {
		return studentList.size();
	}

	public int getNumber(Student student) {
		return student.number;
	}

	public String getName(Student student) {
		return student.name;
	}

	public String getMajor(Student student) {
		return student.major;
	}

	public int getGrade(Student student) {
		return student.grade;
	}
}
