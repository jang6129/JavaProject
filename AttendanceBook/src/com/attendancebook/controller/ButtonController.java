package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.ObjectManager;
import com.attendancebook.view.SampleGUI;

public class ButtonController {
	private JButton btn1, btn2, btn3, btn4, btn5;

	ObjectManager objectManager = new ObjectManager();
	SampleGUI gui = new SampleGUI(objectManager.framedata);
	FrameData framedata = objectManager.framedata;

	public ButtonController() {
		String wholeInfo;
		try {
			wholeInfo = objectManager.filemanager.read();
			if (wholeInfo != null) {
				objectManager.filemanager.stringToObject(wholeInfo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btn1 = framedata.getBtn1();
		btn2 = framedata.getBtn2();
		btn3 = framedata.getBtn3();
		btn4 = framedata.getBtn4();
		btn5 = framedata.getBtn5();

		btn1.addActionListener(new EventController(objectManager));
		// 학생 등록 버튼 이벤트
		btn2.addActionListener(new PrintController(objectManager));
		// 전체 출력 버튼 이벤트
		btn3.addActionListener(new EditController(objectManager));
		// 학생 수정 버튼 이벤트
		btn4.addActionListener(new RemoveController(objectManager));
		// 학생 삭제 버튼 이벤트
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}