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

public class SampleGUI {

	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	JTextArea ta = new JTextArea();
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel jl1 = new JLabel("NAME : ");
	JLabel jl2 = new JLabel("MAJOR : ");
	JLabel jl3 = new JLabel("GRADE : ");

	public SampleGUI() {
		GUI_init();
	}

	public void GUI_init() {
		// GUI 틀 만들기
		jframe.setBounds(50, 50, 500, 330); // 전체 창 크기
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 누르면
																// 꺼지게 설정
		jframe.setVisible(true);
		jpanel.setLayout(null);
		jframe.add(jpanel);
		// 입력 공간
		tf1.setBounds(80, 25, 70, 25);
		jpanel.add(tf1); // 이름 입력 공간
		tf2.setBounds(225, 25, 70, 25);
		jpanel.add(tf2); // 전공 입력 공간
		tf3.setBounds(365, 25, 70, 25);
		jpanel.add(tf3); // 학년 입력 공간
		jl1.setBounds(30, 21, 70, 30);	
		jpanel.add(jl1); // 이름 라벨
		jl2.setBounds(170, 21, 70, 30);
		jpanel.add(jl2); // 전공 라벨
		jl3.setBounds(310, 21, 70, 30);
		jpanel.add(jl3); // 학년 라벨
		// 입력한 글이 보이는 창
		JScrollPane jsp = new JScrollPane(ta); // 창 스크롤
		jsp.setBounds(20, 70, 300, 200);
		jpanel.add(jsp);
		// 입력 버튼 - create
		jpanel.add(btn1 = new JButton("학생 등록"));
		btn1.setBounds(350, 70, 100, 30);
		// 출력 버튼 - read
		jpanel.add(btn2 = new JButton("전체 출력"));
		btn2.setBounds(350, 110, 100, 30);
		// 수정 버튼 - update
		jpanel.add(btn3 = new JButton("학생 수정"));
		btn3.setBounds(350, 150, 100, 30);
		// 삭제 버튼 - delete
		jpanel.add(btn4 = new JButton("학생 삭제"));
		btn4.setBounds(350, 190, 100, 30);
		// 종료 버튼
		jpanel.add(btn5 = new JButton("종료"));
		btn5.setBounds(350, 230, 100, 30);
//		DAO dao = new DAO();
		// 입력 버튼 이벤트
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				ta.setText("");
//				String name = tf1.getText();
//				int age = Integer.parseInt(tf2.getText());
////				dao.insertData(new Data(name, age));
//				ta.append("입력 완료 \n");
//				tf1.setText("");
//				tf2.setText("");
//			}
//		});
		btn1.addActionListener(new EventController());
		// 출력 버튼 이벤트
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
//				ArrayList<Data> arr = new ArrayList<Data>();
//				arr = dao.readData();
				ta.append("name" + "\t" + "age" + "\n");
				ta.append("--------------------------\n");
				// 전체 출력
//				for (int i = 0; i < arr.size(); i++) {
//					ta.append(arr.get(i).getName() + " \t " + arr.get(i).getAge() + "\n");
//				}
			}
		});
		// 수정 버튼 이벤트
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
				String name = tf1.getText();
				int age = Integer.parseInt(tf2.getText());
//				dao.updateData(new Data(name, age));
				ta.append("수정 완료 \n");
				tf1.setText("");
				tf2.setText("");
			}
		});
		// 삭제 버튼 이벤트
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
				String name = tf1.getText();
//				dao.deleteData(name);
				ta.append("삭제 완료 \n");
				tf1.setText("");
				tf2.setText("");
			}
		});
		// 종료 버튼 이벤트
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