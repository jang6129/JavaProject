package com.attendancebook.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CommandConsole extends JFrame {
	
	public CommandConsole() {
//		setTitle("학생부");
//		setSize(500, 500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	}
	
	public void guide() {
//		Container contentPane = getContentPane();
//		contentPane.add(new JLabel("1. 학생 등록\n2. 학생 수정\n3. 학생 삭제\n4. 전체 출력\n5. 학생 검색\n6. 프로그램 종료\n\n입력하세요 : "));
		System.out.println("1. 학생 등록\n2. 학생 수정\n3. 학생 삭제\n4. 전체 출력\n5. 학생 검색\n6. 프로그램 종료\n\n입력하세요 : ");
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
