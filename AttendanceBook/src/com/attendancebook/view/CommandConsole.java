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
		frame.setTitle("�л���");
		frame.setSize(900, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton register = new JButton("�л� ���");
		JButton modification = new JButton("�л� ����");
		JButton delete = new JButton("�л� ����");
		JButton print = new JButton("��ü ���");
		JButton search = new JButton("�л� �˻�");
		JButton close = new JButton("���α׷� ����");
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
		
