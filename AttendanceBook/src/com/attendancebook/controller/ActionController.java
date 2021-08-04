package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public abstract class ActionController implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	StudentList studentlist = null;
	FrameData frameData = null;
	Student student = null;
	
	public ActionController(FrameData frameData, StudentList studentlist) {
		this.frameData = frameData;
		this.studentlist = studentlist;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
