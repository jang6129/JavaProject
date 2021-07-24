package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.attendancebook.view.SampleGUI;
import com.attendancebook.model.StudentList;

public class EventController implements ActionListener {
	String name;
	String major;
	int grade;
	StudentList studentlist = new StudentList();
	
	public EventController(String name, String major, int grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		studentlist.add(name, major, grade);
	}
}
