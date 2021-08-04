package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;
import com.attendancebook.view.SampleGUI;

public class ButtonController {
	private JButton btn1, btn2, btn3, btn4, btn5;

	FrameData framedata = new FrameData();
	SampleGUI gui = new SampleGUI(framedata);
	StudentList studentlist = new StudentList();

	public ButtonController() {
		btn1 = framedata.getBtn1();
		btn2 = framedata.getBtn2();
		btn3 = framedata.getBtn3();
		btn4 = framedata.getBtn4();
		btn5 = framedata.getBtn5();
		

		btn1.addActionListener(new EventController(framedata, studentlist));
		// 학생 등록 버튼 이벤트
		btn2.addActionListener(new PrintController(framedata, studentlist));
		// 전체 출력 버튼 이벤트
		btn3.addActionListener(new EditController(framedata, studentlist));
		// 학생 수정 버튼 이벤트
		btn4.addActionListener(new RemoveController(framedata, studentlist));
		// 학생 삭제 버튼 이벤트
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}