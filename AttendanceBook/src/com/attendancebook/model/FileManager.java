package com.attendancebook.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private static final String FILE_PATH = "C:\\Users\\jang6\\Desktop\\StudentData.txt";

	public String objectToString(ArrayList<Student> students) {
		StringBuilder sb = new StringBuilder();
		for (Student s : students) {
			sb.append(s.name + " " + s.major + " " + s.grade + " " + s.number + "\n");
		}
		return sb.toString();
	}
	
	public void stringFromFile() {
		
	}
	
	
	public void write(String inputString) throws IOException {
		FileWriter fw;
		fw = new FileWriter(FILE_PATH);
		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("�ȳ��ϼ���");
//		bw.newLine();
//		bw.write("�л� ������ ���õ� ����");
		bw.close();
	}

	public String read() throws IOException {
		FileReader fr = new FileReader(FILE_PATH);
		BufferedReader br = new BufferedReader(fr);

		String str = null;
		while ( (str = br.readLine()) != null) {
			System.out.println(str);
		}

		return null;
	}

	public static void main(String[] args) throws IOException {
		FileManager fm = new FileManager();
	}
}
