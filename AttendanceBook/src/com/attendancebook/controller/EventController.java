package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;

public class EventController implements ActionListener {
	String name;
	String major;
	int grade;
	JTextField tf1, tf2, tf3;
	StudentList studentlist = null;
	FrameData frameData = null;
	
	public EventController(FrameData frameData, StudentList studentlist) {
		this.frameData = frameData;
		this.studentlist = studentlist;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();		
		JTextArea ta = frameData.getTa();
		name = frameData.getTf1().getText();
		major = frameData.getTf2().getText();
		grade = Integer.parseInt(frameData.getTf3().getText());
		studentlist.add(name, major, grade);
		ta.append("등록 완료\n\n");
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
	}
}
