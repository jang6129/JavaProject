package com.attendancebook.controller;

import com.attendancebook.model.StudentList;

public class ProgramController {

	public void start() {
		int command = 0;
//		StudentList studentList = new StudentList();
		StudentController studentController = new StudentController();
	}

	public void finish() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
