package com.attendancebook.view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CommandConsole extends JFrame {
	
	public CommandConsole() {
//		setTitle("�л���");
//		setSize(500, 500);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	}
	
	public void guide() {
//		Container contentPane = getContentPane();
//		contentPane.add(new JLabel("1. �л� ���\n2. �л� ����\n3. �л� ����\n4. ��ü ���\n5. �л� �˻�\n6. ���α׷� ����\n\n�Է��ϼ��� : "));
		System.out.println("1. �л� ���\n2. �л� ����\n3. �л� ����\n4. ��ü ���\n5. �л� �˻�\n6. ���α׷� ����\n\n�Է��ϼ��� : ");
	}

	public void addStudentGuideNumber() {
		System.out.println("�й� �Է� :");
	}

	public void addStudentGuideName() {
		System.out.println("�̸� �Է� :");
	}

	public void addStudentGuideMajor() {
		System.out.println("�а� �Է� :");
	}

	public void addStudentGuideGrade() {
		System.out.println("�г� �Է� :");
	}

	public void updateNumberGuide() {
		System.out.println("������ �л��� �й��� �Է��ϼ��� : ");
	}

	public void removeNumberGuide() {
		System.out.println("������ �л��� �й��� �Է��ϼ��� : ");
	}

	public void updateStudentWhich() {
		System.out.println("������ �����Ͻðڽ��ϱ�?\n1. �̸�\n2. �а�\n3. �г�\n");
	}
}
