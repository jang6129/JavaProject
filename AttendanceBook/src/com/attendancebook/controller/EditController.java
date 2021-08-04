package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class EditController extends ActionController {
	
	public EditController(FrameData frameData, StudentList studentlist) {
		super(frameData, studentlist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		tf4 = frameData.getTf4();
		JTextArea ta = frameData.getTa();
		studentlist.update(Integer.parseInt(tf4.getText()), tf1.getText(), tf2.getText(), Integer.parseInt(tf3.getText()));
	}

}
