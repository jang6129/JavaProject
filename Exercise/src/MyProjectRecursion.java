
public class MyProjectRecursion {
	public static void main(String[] args) {
		System.out.println("1부터 5까지의 합은 : " + Function(5));
	}

	public static int Function(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num + Function(num - 1);
		}
	}
}
