package com.attendancebook.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private static final String FILE_PATH = "C:\\Users\\jang6\\Desktop\\StudentData.txt";
	StudentList studentList;

	public FileManager(StudentList studentlist) {
		this.studentList = studentlist;
	}

	public String objectToString() {
		StringBuilder sb = new StringBuilder();
		for (Student s : studentList.studentList) {
			sb.append(s.name + " " + s.major + " " + s.grade + " " + s.number + "\n");
		}
		return sb.toString();
	}

	public void stringToObject(String wholeinfo) {

		try {
			String[] splitByLine = wholeinfo.split("\n");
			String[] list = new String[splitByLine.length];
			Student student;

			for (int i = 0; i < splitByLine.length; i++) {
				String[] splitBySpace = splitByLine[i].split(" ");
				student = new Student(splitBySpace[0], splitBySpace[1], Integer.parseInt(splitBySpace[2]),
						Integer.parseInt(splitBySpace[3]));
				studentList.add(student);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
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

		String str = null;
		StringBuilder sb = new StringBuilder();

		while ((str = br.readLine()) != null) {
			sb.append(str + "\n");
		}
		return sb.toString();
	}
}
