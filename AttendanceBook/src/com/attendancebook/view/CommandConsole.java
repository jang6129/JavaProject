package com.attendancebook.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CommandConsole {

	public CommandConsole() {
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("학생부");
		frame.setSize(900, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton register = new JButton("학생 등록");
		JButton modification = new JButton("학생 수정");
		JButton delete = new JButton("학생 삭제");
		JButton print = new JButton("전체 출력");
		JButton search = new JButton("학생 검색");
		JButton close = new JButton("프로그램 종료");
		JTextArea textScreen = new JTextArea();

		panel.add(register);
		panel.add(modification);
		panel.add(delete);
		panel.add(print);
		panel.add(search);
		panel.add(close);
		panel.add(textScreen);
		frame.add(panel);
		
//		register.addActionListener(new ActionListener() {	
//			public void actionPerformed(ActionEvent e) {
//				textScreen.setText(textScreen.getText());
//			}
		}

	public void addStudentGuideNumber() {
		System.out.println("학번 입력 :");
	}

	public void addStudentGuideName() {
		System.out.println("이름 입력 :");
	}

	public void addStudentGuideMajor() {
		System.out.println("학과 입력 :");
	}

	public void addStudentGuideGrade() {
		System.out.println("학년 입력 :");
	}

	public void updateNumberGuide() {
		System.out.println("수정할 학생의 학번을 입력하세요 : ");
	}

	public void removeNumberGuide() {
		System.out.println("삭제할 학생의 학번을 입력하세요 : ");
	}

	public void updateStudentWhich() {
		System.out.println("무엇을 수정하시겠습니까?\n1. 이름\n2. 학과\n3. 학년\n");
	}
}
		
