import java.util.Scanner;

class Rectangle {
	int width, height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scan.close();
	}
}
