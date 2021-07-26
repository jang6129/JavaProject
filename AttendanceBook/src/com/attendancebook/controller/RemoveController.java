package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class RemoveController implements ActionListener {
	JTextField tf4;
	JTextArea ta;
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
		ta = framedata.getTa();
		studentlist.remove(Integer.parseInt(tf4.getText()));
		ta.append("학생 정보가 삭제되었습니다.\n\n");
	}

}
