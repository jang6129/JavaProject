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

public class RemoveController extends ActionController implements ActionListener {
	JTextField tf4;
	JTextArea ta;

	public RemoveController(ObjectManager objectManager) {
		super(objectManager);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf4 = frameData.getTf4();
		ta = frameData.getTa();
		Student student;
		StringBuilder sb = new StringBuilder();
		studentlist.remove(Integer.parseInt(tf4.getText()));
		
		for (int i = 0; i < studentlist.getSize(); i++) {
			student = studentlist.get(i);
			if (student.getStudentNumber() != Integer.parseInt(tf4.getText())) {
				sb.append(student.getStudentName() + " " + student.getStudentMajor() + " " + student.getStudentGrade() + " " + student.getStudentNumber() + "\n");
			}
		}
		
		try {
			filemanager.write(sb.toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		String wholeInfo;
//		try {
//			wholeInfo = objectManager.filemanager.read();
//			objectManager.filemanager.stringToObject(wholeInfo);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		ta.append("학생 정보가 삭제되었습니다.\n\n");
		tf4.setText("");
	}
}
