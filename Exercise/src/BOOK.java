
public class BOOK {
	String title;
	String author;
	
	public BOOK(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public BOOK(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		BOOK littlePrince = new BOOK("�����", "�������丮");
		BOOK loveStory = new BOOK("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
