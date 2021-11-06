package com.memopad.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import com.memopad.model.ObjectManager;
import com.memopad.view.GUI;

public class DeleteFolderController implements ActionListener {
	ObjectManager objectManager;
	GUI gui;

	public DeleteFolderController(ObjectManager objectManager, GUI gui) {
		this.objectManager = objectManager;
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) gui.treeGUI.getSelectedNode();
		if (selectedNode != null) {
			objectManager.folderManager.setSelectedFolder(selectedNode.getUserObject().toString());
//			System.out.println(folderTitle);
		}
		System.out.println(objectManager.folderManager.getSelectedFolder());
		String path = objectManager.fileManager.LOCAL_PATH + objectManager.folderManager.getSelectedFolder();
		File folder = new File(path);
		try {
			while (folder.exists()) {
				File[] folderList = folder.listFiles(); // ���ϸ���Ʈ ������

				for (int j = 0; j < folderList.length; j++) {
					folderList[j].delete(); // ���� ����
				}

				if (folderList.length == 0 && folder.isDirectory()) {
					folder.delete(); // ������� ����
					objectManager.folderManager.deleteFolder(objectManager.folderManager
							.getFolderByTitle(objectManager.folderManager.getSelectedFolder()));
					gui.treeGUI.reload();
				}
			}
		} catch (Exception e1) {
			e1.getStackTrace();
		}
	}

}
