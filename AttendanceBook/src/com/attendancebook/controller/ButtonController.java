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
		// �л� ��� ��ư �̺�Ʈ
		btn2.addActionListener(new PrintController(objectManager));
		// ��ü ��� ��ư �̺�Ʈ
		btn3.addActionListener(new EditController(objectManager));
		// �л� ���� ��ư �̺�Ʈ
		btn4.addActionListener(new RemoveController(objectManager));
		// �л� ���� ��ư �̺�Ʈ
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}