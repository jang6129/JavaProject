package com.attendancebook.controller;

import java.util.Scanner;

import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;
import com.attendancebook.view.CommandConsole;

public class StudentController {
	CommandConsole console = new CommandConsole();
	Scanner scan = new Scanner(System.in);
	StudentList studentList = null;

	public StudentController() {
		studentList = new StudentList();
	}

	public StudentController(StudentList studentList) {
		this.studentList = studentList;
	}

	public int getCommand() {
		console.guide();
		return Integer.parseInt(scan.nextLine());
	}

	public void addStudent() {
		console.addStudentGuideName();
		String name = scan.nextLine();
		console.addStudentGuideMajor();
		String major = scan.nextLine();
		console.addStudentGuideGrade();
		int grade = Integer.parseInt(scan.nextLine());
		studentList.add(name, major, grade);
	}

	public void updateStudent() {
		console.updateNumberGuide();
		int number = Integer.parseInt(scan.nextLine());
		console.updateStudentWhich();
		int input = Integer.parseInt(scan.nextLine());
		if (input == 1) {
			console.addStudentGuideName();
			String name = scan.nextLine();
			studentList.updateName(number, name);
		} else if (input == 2) {
			console.addStudentGuideMajor();
			String major = scan.nextLine();
			studentList.updateMajor(number, major);
		} else if (input == 3) {
			console.addStudentGuideGrade();
			int grade = Integer.parseInt(scan.nextLine());
			studentList.updateGrade(number, grade);
		} else {
			console.addStudentGuideName();
			String major = scan.nextLine();
			console.addStudentGuideGrade();
			int grade = Integer.parseInt(scan.nextLine());
			studentList.update(number, major, grade);
		}
	}

	public void removeStudent() {
		console.removeNumberGuide();
		int number = Integer.parseInt(scan.nextLine());
		studentList.remove(number);
	}

	public void searchStudent() {
		if (studentList.getSize() > 0) {
			console.addStudentGuideNumber();
			int number = Integer.parseInt(scan.nextLine());
			Student student = studentList.search(number);
			if (student.isEmpty()) {
				System.out.println("입력된 학생이 없습니다.\n");
				return;
			} 
			student.introduceMyself();
		} else {
			System.out.println("등록된 학생이 없습니다.\n");
		}
	}

	public void printAll() {
		for (int i = 0; i < studentList.getSize(); i++) {
			Student student = studentList.get(i);
			student.introduceMyself();
		}
	}

}
