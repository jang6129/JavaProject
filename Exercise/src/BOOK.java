
public class BOOK {
	String title;
	String author;
	
	public BOOK(String t) {
		title = t;
		author = "작자미상";
	}
	
	public BOOK(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		BOOK littlePrince = new BOOK("어린왕자", "생텍쥐페리");
		BOOK loveStory = new BOOK("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
