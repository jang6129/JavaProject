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

import com.attendancebook.controller.EventController;
import com.attendancebook.controller.PrintController;
import com.attendancebook.model.FrameData;
import com.attendancebook.model.StudentList;

public class SampleGUI {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	public JTextArea ta;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel jl1 = new JLabel("NAME : ");
	JLabel jl2 = new JLabel("MAJOR : ");
	JLabel jl3 = new JLabel("GRADE : ");
	StudentList studentlist = new StudentList();
	FrameData frameData = null;
	public SampleGUI() {
		frameData = new FrameData();
		tf1 = frameData.getTf1();
		tf2 = frameData.getTf2();
		tf3 = frameData.getTf3();
		ta = frameData.getTa();
		GUI_init();
	}

	public void GUI_init() {
		// GUI Ʋ �����
		jframe.setBounds(50, 50, 500, 330); // ��ü â ũ��
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������
																// ������ ����
		jframe.setVisible(true);
		jpanel.setLayout(null);
		jframe.add(jpanel);
		// �Է� ����
		tf1.setBounds(80, 25, 70, 25);
		jpanel.add(tf1); // �̸� �Է� ����
		tf2.setBounds(225, 25, 70, 25);
		jpanel.add(tf2); // ���� �Է� ����
		tf3.setBounds(365, 25, 70, 25);
		jpanel.add(tf3); // �г� �Է� ����
		jl1.setBounds(30, 21, 70, 30);
		jpanel.add(jl1); // �̸� ��
		jl2.setBounds(170, 21, 70, 30);
		jpanel.add(jl2); // ���� ��
		jl3.setBounds(310, 21, 70, 30);
		jpanel.add(jl3); // �г� ��
		// �Է��� ���� ���̴� â
		JScrollPane jsp = new JScrollPane(ta); // â ��ũ��
		jsp.setBounds(20, 70, 300, 200);
		jpanel.add(jsp);
		// �Է� ��ư - create
		jpanel.add(btn1 = new JButton("�л� ���"));
		btn1.setBounds(350, 70, 100, 30);
		// ��� ��ư - read
		jpanel.add(btn2 = new JButton("��ü ���"));
		btn2.setBounds(350, 110, 100, 30);
		// ���� ��ư - update
		jpanel.add(btn3 = new JButton("�л� ����"));
		btn3.setBounds(350, 150, 100, 30);
		// ���� ��ư - delete
		jpanel.add(btn4 = new JButton("�л� ����"));
		btn4.setBounds(350, 190, 100, 30);
		// ���� ��ư
		jpanel.add(btn5 = new JButton("����"));
		btn5.setBounds(350, 230, 100, 30);
//		DAO dao = new DAO();
		// �Է� ��ư �̺�Ʈ
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				ta.setText("");
//				String name = tf1.getText();
//				int age = Integer.parseInt(tf2.getText());
////				dao.insertData(new Data(name, age));
//				ta.append("�Է� �Ϸ� \n");
//				tf1.setText("");
//				tf2.setText("");
//			}
//		});
		btn1.addActionListener(new EventController(frameData, studentlist));
		// ��� ��ư �̺�Ʈ
		btn2.addActionListener(new PrintController(frameData, studentlist));
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				ta.setText("");
//				ta.append("�й�" + "\t" + "�̸�" + "\t" + "����" + "\t" + "�г�" + "\n");
//				ta.append("------------------------------------------------------------------------\n");

		// ���� ��ư �̺�Ʈ
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
				String name = tf1.getText();
				int age = Integer.parseInt(tf2.getText());
//				dao.updateData(new Data(name, age));
				ta.append("���� �Ϸ� \n");
				tf1.setText("");
				tf2.setText("");
			}
		});
		// ���� ��ư �̺�Ʈ
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
				String name = tf1.getText();
//				dao.deleteData(name);
				ta.append("���� �Ϸ� \n");
				tf1.setText("");
				tf2.setText("");
			}
		});
		// ���� ��ư �̺�Ʈ
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		SampleGUI gui = new SampleGUI();
	}
}