package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventController implements ActionListener {
	
	//여기다가 생성자 오버로딩 하면됨

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ta.setText("");
		String name = tf1.getText();
		int age = Integer.parseInt(tf2.getText());
//		dao.insertData(new Data(name, age));
		ta.append("입력 완료 \n");
		tf1.setText("");
		tf2.setText("");

	}

}
