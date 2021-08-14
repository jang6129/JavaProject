package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.ObjectManager;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class EditController extends ActionController {
	
	public EditController(ObjectManager objectManager) {
		super(objectManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		tf4 = frameData.getTf4();
		Student student;
		StringBuilder sb = new StringBuilder();
		JTextArea ta = frameData.getTa();
		studentlist.update(Integer.parseInt(tf4.getText()), tf1.getText(), tf2.getText(), Integer.parseInt(tf3.getText()));
	
	for (int i = 0; i < studentlist.getSize(); i++) {
		student = studentlist.get(i);
		sb.append(student.getStudentName() + " " + student.getStudentMajor() + " " + student.getStudentGrade() + " " + student.getStudentNumber() + "\n");
	}
	
	try {
		filemanager.write(sb.toString());
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
//	String wholeInfo;
//	try {
//		wholeInfo = objectManager.filemanager.read();
//		objectManager.filemanager.stringToObject(wholeInfo);
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
	
	ta.append("학생 정보가 수정되었습니다.\n\n");
	tf1.setText("");
	tf2.setText("");
	tf3.setText("");
	tf4.setText("");
	}
}
