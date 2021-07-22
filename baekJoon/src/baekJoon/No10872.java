package baekJoon;

import java.util.Scanner;

public class No10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int N = Integer.parseInt(s);

		System.out.println(function(N));
	}

	public static int function(int N) {
		if(N==0) {
			return 1;
		}
		else {
			return N * function((N-1));
		}
	}
}
