package com.attendancebook.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private static final String FILE_PATH = "C:\\Users\\jang6\\Desktop\\StudentData.txt";
	StudentList studentlist = new StudentList();

	public String objectToString(Student student) {
		StringBuilder sb = new StringBuilder();
		Student s = student;
		sb.append(s.name + " " + s.major + " " + s.grade + " " + s.number + "\n");

		return sb.toString();
	}

	public void stringToObject(String wholeinfo) {
		String[] splitByLine = wholeinfo.split("\n");
		String[] list = new String[splitByLine.length];
		Student student;

		for (int i = 0; i < splitByLine.length; i++) {
			String[] splitBySpace = splitByLine[i].split(" ");
			studentlist.add(splitBySpace[0], splitBySpace[1], Integer.parseInt(splitBySpace[3]));
		}
	}

	public void write(String inputString) throws IOException {
		FileWriter fw;
		fw = new FileWriter(FILE_PATH);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(inputString);
		bw.close();
	}

	public String read() throws IOException {
		FileReader fr = new FileReader(FILE_PATH);
		BufferedReader br = new BufferedReader(fr);
		Student student = new Student();

		String str = null;

		while ((str = br.readLine()) != null) {

		}
		return str;
	}
}
