package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventController implements ActionListener {
	
	//����ٰ� ������ �����ε� �ϸ��

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ta.setText("");
		String name = tf1.getText();
		int age = Integer.parseInt(tf2.getText());
//		dao.insertData(new Data(name, age));
		ta.append("�Է� �Ϸ� \n");
		tf1.setText("");
		tf2.setText("");

	}

}
