package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class EditController implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	StudentList studentlist = null;
	FrameData frameData = null;
	Student student = null;
	
	public EditController(FrameData frameData, StudentList studentlist) {
		this.frameData = frameData;
		this.studentlist = studentlist;
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
		
//		if (student.getStudentNumber() == 0) {
//			ta.append("해당 학번의 학생이 존재하지 않습니다.\n");
//		} else {
//			student.setName(tf1.getText());
//			student.setMajor(tf2.getText());
//			student.setGrade(Integer.parseInt(tf3.getText()));
//			ta.append("학생 정보가 수정되었습니다.\n");
//		}
	}

}
