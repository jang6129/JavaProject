package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JTextArea;

import com.attendancebook.model.ObjectManager;
import com.attendancebook.model.Student;

public class EventController extends ActionController /* implements ActionListener */ {
	String name;
	String major;
	int grade;

	public EventController(ObjectManager objectManager) {
		super(objectManager);
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
			Student student = new Student(name, major, grade);
			studentlist.add(student);
			String studentInfo = filemanager.objectToString();
			if (studentlist.getSize() == 5) {
				try {
					filemanager.write(studentInfo);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			ta.append("학생 정보가 등록되었습니다  " + "(" + studentlist.getSize() + "/" + 5 + ")" + "\n\n");
		}
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
	}
}
