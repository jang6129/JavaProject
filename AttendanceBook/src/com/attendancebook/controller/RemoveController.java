package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.ObjectManager;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public class RemoveController extends ActionController implements ActionListener {
	JTextField tf4;
	JTextArea ta;
	StudentList studentlist = null;
	FrameData framedata = null;
	Student student = null;

	public RemoveController(ObjectManager objectManager) {
		super(objectManager);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		tf4 = framedata.getTf4();
		ta = framedata.getTa();
		studentlist.remove(Integer.parseInt(tf4.getText()));
		ta.append("�л� ������ �����Ǿ����ϴ�.\n\n");
		tf4.setText("");
	}

}
