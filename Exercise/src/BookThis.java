
public class BookThis {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}

	public BookThis() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public BookThis(String title) {
		this(title, "���ڹ̻�");
	}
	
	public BookThis(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		BookThis littlePrince = new BookThis("�����", "�������丮");
		BookThis loveStory = new BookThis("������");
		BookThis emptyBook = new BookThis();
		loveStory.show();
	}
}

