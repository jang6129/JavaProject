import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}


public class RectA {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
	}
}
