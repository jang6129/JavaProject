package com.attendancebook.controller;

import com.attendancecbook.model.StudentList;

public class ProgramController {

	public void start() {
		int command = 0;
//		StudentList studentList = new StudentList();
		StudentController studentController = new StudentController();

		do {
			command = studentController.getCommand();

			if (command == 1) {
				studentController.addStudent();
			} else if (command == 2) {
				studentController.updateStudent();
			} else if (command == 3) {
				studentController.removeStudent();
			} else if (command == 4) {
				studentController.printAll();
			} else if (command == 5) {
				studentController.searchStudent();
			}

		} while (command != 6);
		finish();
	}

	public void finish() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
