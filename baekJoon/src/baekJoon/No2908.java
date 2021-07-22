package baekJoon;

import java.util.Scanner;

public class No2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String num[] = scan.nextLine().split(" ");
		

		int reverseNum1[] = new int[3];
		int reverseNum2[] = new int[3];

		for (int i = 0; i < 3; i++) {
			reverseNum1[i] = (int) num[0].charAt(2 - i) - 48;
			reverseNum2[i] = (int) num[1].charAt(2 - i) - 48;
		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println(reverseNum1[i] + " " + reverseNum2[i]);
//		}
		if (reverseNum1[0] > reverseNum2[0]) {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(reverseNum1[i]);
			}
		}
		else if (reverseNum1[0] < reverseNum2[0]) {
			for(int i = 0 ; i < 3 ; i++) {
			System.out.print(reverseNum2[i]);
			}
		}
		else if (reverseNum1[0]==reverseNum2[0] && reverseNum1[1]>reverseNum2[1]) {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(reverseNum1[i]);
			}
		}
		else if (reverseNum1[0]==reverseNum2[0] && reverseNum1[1]<reverseNum2[1])  {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(reverseNum2[i]);
			}
		}
		else if (reverseNum1[0]==reverseNum2[0] && reverseNum1[1]==reverseNum2[1] && reverseNum1[2]>reverseNum2[2]) {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(reverseNum1[i]);
			}
		}
		else if (reverseNum1[0]==reverseNum2[0] && reverseNum1[1]==reverseNum2[1] && reverseNum1[2]<reverseNum2[2]) {
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(reverseNum2[i]);
			}
		}
		else {
			System.out.println("두 수가 같습니다.");
		}
	}
}
