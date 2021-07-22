package baekJoon;

import java.util.Scanner;

public class No2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, mul;
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		mul = A*B*C;
		func(mul);
	}
	
	
	public static void func(int mul) {
		
		String str = String.valueOf(mul);
		int countCheck[] = new int[10];
		
		for (int i = 0; i < str.length() ; i++) {
			int value = (int)str.charAt(i) - 48;
			countCheck[value] ++;
		}
		for (int i = 0; i < 10 ; i++) {
			System.out.println(countCheck[i]);
		}
	}
}
