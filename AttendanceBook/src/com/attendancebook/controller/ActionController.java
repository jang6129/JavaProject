package com.attendancebook.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.attendancebook.model.FileManager;
import com.attendancebook.model.FrameData;
import com.attendancebook.model.ObjectManager;
import com.attendancebook.model.Student;
import com.attendancebook.model.StudentList;

public abstract class ActionController implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	StudentList studentlist;
	FrameData frameData = null;
	FileManager filemanager;
	ObjectManager objectManager;
	
	public ActionController(ObjectManager objectManager) {
		this.objectManager = objectManager;
		this.studentlist = objectManager.studentlist;
		this.filemanager = objectManager.filemanager;
		this.frameData = objectManager.framedata;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
