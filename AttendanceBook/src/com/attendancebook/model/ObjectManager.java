package com.attendancebook.model;

public class ObjectManager {
	public static StudentList studentlist = new StudentList();
	public static FileManager filemanager = new FileManager(studentlist);
	public static FrameData framedata = new FrameData();
}
