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
		// GUI 틀 만들기
		jframe.setBounds(50, 50, 615, 450); // 전체 창 크기
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 누르면
																// 꺼지게 설정
		jframe.setVisible(true);
		jframe.setTitle("Attendance Book");
		jpanel.setLayout(null);
		jframe.add(jpanel);
		// 입력 공간
		tf1.setBounds(70, 25, 70, 25);
		jpanel.add(tf1); // 이름 입력 공간
		tf2.setBounds(215, 25, 70, 25);
		jpanel.add(tf2); // 전공 입력 공간
		tf3.setBounds(355, 25, 70, 25);
		jpanel.add(tf3); // 학년 입력 공간
		tf4.setBounds(505, 25, 70, 25);
		jpanel.add(tf4); // 학번 입력 공간
		jl1.setBounds(20, 21, 70, 30);
		jpanel.add(jl1); // 이름 라벨
		jl2.setBounds(160, 21, 70, 30);
		jpanel.add(jl2); // 전공 라벨
		jl3.setBounds(300, 21, 70, 30);
		jpanel.add(jl3); // 학년 라벨
		jl4.setBounds(440, 21, 70, 30);
		jpanel.add(jl4); // 학번 라벨
		JScrollPane jsp = new JScrollPane(ta); // 창 스크롤
		jsp.setBounds(40, 80, 400, 300);
		jpanel.add(jsp);
		// 입력 버튼 - create
		jpanel.add(btn1 = frameData.getBtn1());
		btn1.setBounds(470, 103, 100, 30);
		// 출력 버튼 - read
		jpanel.add(btn2 = frameData.getBtn2());
		btn2.setBounds(470, 158, 100, 30);
		// 수정 버튼 - update
		jpanel.add(btn3 = frameData.getBtn3());
		btn3.setBounds(470, 213, 100, 30);
		// 삭제 버튼 - delete
		jpanel.add(btn4 = frameData.getBtn4());
		btn4.setBounds(470, 268, 100, 30);
		// 종료 버튼
		jpanel.add(btn5 = frameData.getBtn5());
		btn5.setBounds(470, 323, 100, 30);
		// 프로그램 종료 버튼 이벤트
	}
}