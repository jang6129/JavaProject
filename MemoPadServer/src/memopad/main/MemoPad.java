package memopad.main;

import com.memopad.controller.ButtonController;
import com.memopad.model.ObjectManager;
import com.memopad.view.TreeGUI;

public class MemoPad {
	public static void main(String[] args) {
		ObjectManager objectManager = new ObjectManager();
		ButtonController buttonController = new ButtonController(objectManager);
		buttonController.gui.treeGUI.reload();
//		
//		
//		Folder folder = new Folder("Fold", "C://users/jinseo/Desktop/");
//		Memo memo = new Memo("hello", "hello My name is Jinseo");
//		Memo memo2 = new Memo("bye", "bye bye");
//		folder.addMemo(memo);
//		folder.addMemo(memo2);
//		folderManager.addFolder(folder);
//		
//		folder = new Folder("Fold2", "C://");
//		memo = new Memo("hi", "hi jinseo");
//		memo2 = new Memo("goodbye", "goodbye jinseo");
//		folder.addMemo(memo);
//		folder.addMemo(memo2);
//		
//		folderManager.addFolder(folder);
//		
//		
//		folderManager.printFolderAll();
		
//		String path = "/Users/Kimmoonsu/Desktop/MemoFolder"; // ���� ���
//		File folder = new File(path);
//
//		// �ش� ���丮�� ������� ���丮�� �����մϴ�.
//		if (!folder.exists()) {
//			try {
//				folder.mkdir(); // ���� �����մϴ�.
//				System.out.println("������ �����Ǿ����ϴ�.");
//			} catch (Exception e) {
//				e.getStackTrace();
//			}
//		} else {
//			System.out.println("�̹� ������ �����Ǿ� �ֽ��ϴ�.");
//		}
	}
}