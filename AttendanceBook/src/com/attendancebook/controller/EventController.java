package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;

public class EventController extends ActionController /* implements ActionListener */ {
	String name;
	String major;
	int grade;

	public EventController(FrameData frameData, StudentList studentlist) {
		super(frameData, studentlist);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		JTextArea ta = frameData.getTa();

		if (studentlist.getSize() >= 5) {
			ta.append("등록 가능한 수를 넘었습니다.\n\n");
		} else if (studentlist.getSize() <= 5) {
			name = frameData.getTf1().getText();
			major = frameData.getTf2().getText();
			grade = Integer.parseInt(frameData.getTf3().getText());
			studentlist.add(name, major, grade);
			ta.append("학생 정보가 등록되었습니다  " + "(" + studentlist.getSize() + "/" + 5 + ")" + "\n\n");
		}
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
	}
}
