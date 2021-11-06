package com.memopad.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import com.memopad.model.Memo;
import com.memopad.model.ObjectManager;
import com.memopad.view.GUI;

public class AddMemoController implements ActionListener {
	ObjectManager objectManager;
	GUI gui;

	public AddMemoController(ObjectManager objectManager, GUI gui) {
		this.objectManager = objectManager;
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) gui.treeGUI.getSelectedNode();
		if (selectedNode != null) {
			objectManager.folderManager.setSelectedFolder(selectedNode.getUserObject().toString());
		}
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		String wholeInfo = gui.memoArea.getText();
		String[] splitByLine = wholeInfo.split("\n");
		String title = splitByLine[0];
		String content;
		for (int i = 1; i < splitByLine.length; i++) {
			sb.append(splitByLine[i] + "\n");
		}
		content = sb.toString();
		Memo memo = new Memo(title, content);
		objectManager.fileManager.writeMemo(objectManager.folderManager.getSelectedFolder(), memo);
		objectManager.folderManager.getFolder(objectManager.folderManager.getSelectedFolder()).addMemo(memo);
		gui.setMemoArea("");
		gui.memoAddFrame.dispose();
		gui.treeGUI.reload();
	}

}
