package com.attendancebook.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.attendancebook.controller.EditController;
import com.attendancebook.controller.EventController;
import com.attendancebook.controller.PrintController;
import com.attendancebook.controller.RemoveController;
import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;

public class SampleGUI {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	public JTextField tf4;
	public JTextArea ta;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel jl1 = new JLabel("NAME : ");
	JLabel jl2 = new JLabel("MAJOR : ");
	JLabel jl3 = new JLabel("GRADE : ");
	JLabel jl4 = new JLabel("NUMBER : ");
	StudentList studentlist = new StudentList();
	FrameData frameData = null;

	public SampleGUI() {
		frameData = new FrameData();
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		tf4 = frameData.getTf4();
		ta = frameData.getTa();
		GUI_init();
	}

	public void GUI_init() {
		// GUI Ʋ �����
		jframe.setBounds(50, 50, 615, 450); // ��ü â ũ��
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������
																// ������ ����
		jframe.setVisible(true);
		jframe.setTitle("Attendance Book");
		jpanel.setLayout(null);
		jframe.add(jpanel);
		// �Է� ����
		tf1.setBounds(70, 25, 70, 25);
		jpanel.add(tf1); // �̸� �Է� ����
		tf2.setBounds(215, 25, 70, 25);
		jpanel.add(tf2); // ���� �Է� ����
		tf3.setBounds(355, 25, 70, 25);
		jpanel.add(tf3); // �г� �Է� ����
		tf4.setBounds(505, 25, 70, 25);
		jpanel.add(tf4); // �й� �Է� ����
		jl1.setBounds(20, 21, 70, 30);
		jpanel.add(jl1); // �̸� ��
		jl2.setBounds(160, 21, 70, 30);
		jpanel.add(jl2); // ���� ��
		jl3.setBounds(300, 21, 70, 30);
		jpanel.add(jl3); // �г� ��
		jl4.setBounds(440, 21, 70, 30);
		jpanel.add(jl4); // �й� ��
		JScrollPane jsp = new JScrollPane(ta); // â ��ũ��
		jsp.setBounds(40, 80, 400, 300);
		jpanel.add(jsp);
		// �Է� ��ư - create
		jpanel.add(btn1 = frameData.getBtn1());
		btn1.setBounds(470, 103, 100, 30);
		// ��� ��ư - read
		jpanel.add(btn2 = frameData.getBtn2());
		btn2.setBounds(470, 158, 100, 30);
		// ���� ��ư - update
		jpanel.add(btn3 = frameData.getBtn3());
		btn3.setBounds(470, 213, 100, 30);
		// ���� ��ư - delete
		jpanel.add(btn4 = frameData.getBtn4());
		btn4.setBounds(470, 268, 100, 30);
		// ���� ��ư
		jpanel.add(btn5 = frameData.getBtn5());
		btn5.setBounds(470, 323, 100, 30);
		// ���α׷� ���� ��ư �̺�Ʈ
	}
}