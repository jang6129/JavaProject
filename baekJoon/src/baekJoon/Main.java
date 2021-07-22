package baekJoon;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int number[] = new int[10];
		int remainder[] = new int[10];
		int count = 0;
		// 1, 1, 1, 1, 1, 2
		for (int i = 0; i < 10; i++) {
			number[i] = scan.nextInt();
		}

		for (int i = 0; i<10 ; i++) {
			remainder[i] = number[i]%42;
		}
		// {1,2,3,4,5,6,7,8,9,10}
		boolean hasValues[] = new boolean[42]; // {true, true, false, true};
		for (int i = 0; i < 10; i ++) {
			hasValues[remainder[i]] = true;
		}
		
		for (int i = 0; i < 42; i++) {
			if (hasValues[i] == true) {
				count ++;
			}
		}
		
		if (count > 0) {
			System.out.println(count);
		} 
		else {
			System.out.println("0");
		}
	}
}
