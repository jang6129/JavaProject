package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class RemoveController implements ActionListener {
	JTextField tf4;
	StudentList studentlist = null;
	FrameData framedata = null;
	Student student = null;

	public RemoveController(FrameData framedata, StudentList studentlist) {
		this.framedata = framedata;
		this.studentlist = studentlist;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf4 = framedata.getTf4();
		studentlist.remove(Integer.parseInt(tf4.getText()));
	}

}
