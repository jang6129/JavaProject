package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;
import com.attendancebook.view.SampleGUI;
import com.attendancebook.controller.EditController;
import com.attendancebook.controller.EventController;
import com.attendancebook.controller.PrintController;
import com.attendancebook.controller.RemoveController;

public class ButtonController {

	private JTextField tf1, tf2, tf3, tf4;
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JTextArea ta;

	FrameData framedata = new FrameData();
	SampleGUI gui = new SampleGUI();
	StudentList studentlist = new StudentList();

	public ButtonController() {
		tf1 = framedata.getTf1();
		tf2 = framedata.getTf2();
		tf3 = framedata.getTf3();
		tf4 = framedata.getTf4();
		btn1 = framedata.getBtn1();
		btn2 = framedata.getBtn2();
		btn3 = framedata.getBtn3();
		btn4 = framedata.getBtn4();
		btn5 = framedata.getBtn5();
		ta = framedata.getTa();
		gui.GUI_init();

		btn1.addActionListener(new EventController(framedata, studentlist));
		// �л� ��� ��ư �̺�Ʈ
		btn2.addActionListener(new PrintController(framedata, studentlist));
		// ��ü ��� ��ư �̺�Ʈ
		btn3.addActionListener(new EditController(framedata, studentlist));
		// �л� ���� ��ư �̺�Ʈ
		btn4.addActionListener(new RemoveController(framedata, studentlist));
		// �л� ���� ��ư �̺�Ʈ
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}