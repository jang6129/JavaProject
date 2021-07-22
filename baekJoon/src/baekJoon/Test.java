package baekJoon;

public class Test {
	public static void main(String args[]) {
		
		Computer com[] = new Computer[2];
		com[0] = new Computer("Jinseo", true, "Windows");
		com[1] = new Computer("Moonsu", true, "Mac");
		
		com[0].printState();
		com[1].printState();
	}
}
