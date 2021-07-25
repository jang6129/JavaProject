package com.attendancebook.model;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameData {
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextArea ta;

	public FrameData() {
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		ta = new JTextArea();
	}

	public JTextField getTf1() {
		return tf1;
	}

	public void setTf1(JTextField tf1) {
		this.tf1 = tf1;
	}

	public JTextField getTf2() {
		return tf2;
	}

	public void setTf2(JTextField tf2) {
		this.tf2 = tf2;
	}

	public JTextField getTf3() {
		return tf3;
	}

	public void setTf3(JTextField tf3) {
		this.tf3 = tf3;
	}

	public JTextField getTf4() {
		return tf4;
	}

	public void setTf4(JTextField tf4) {
		this.tf4 = tf4;
	}
	
	public JTextArea getTa() {
		return ta;
	}

	public void setTa(JTextArea ta) {
		this.ta = ta;
	}

}
