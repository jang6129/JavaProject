package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;

public class PrintController implements ActionListener {
	JTextField tf1, tf2, tf3;
	StudentList studentlist = null;
	FrameData frameData = null;

	public PrintController(FrameData frameData, StudentList studentlist) {
		this.frameData = frameData;
		this.studentlist = studentlist;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		JTextArea ta = frameData.getTa();
		
		ta.append("--------------------------------------------------------------------------\n");
		ta.append("학번" + "\t" + "이름" + "\t" + "전공" + "\t" + "학년" + "\n");
		ta.append("--------------------------------------------------------------------------\n");

		if (studentlist.getSize() == 0) {
			ta.append("등록된 학생이 없습니다.\n");
		} else {
			for (int i = 0; i < studentlist.getSize(); i++) {
				int number = studentlist.getNumber(studentlist.get(i));
				String name = studentlist.getName(studentlist.get(i));
				String major = studentlist.getMajor(studentlist.get(i));
				int grade = studentlist.getGrade(studentlist.get(i));
				ta.append(number + "\t" + name + "\t" + major + "\t" + grade + "\n");
			} ta.append("\n");
		}
	}
}
