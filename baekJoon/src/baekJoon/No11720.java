package baekJoon;

import java.util.Scanner;

public class No11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int N = Integer.parseInt(s);
		char numb[] = new char[N];
		s = scan.nextLine();
		
		for (int i = 0 ; i < N ; i++) {
			numb[i] = s.charAt(i);
		}
		
		int sum = 0;
		
		for (int i = 0 ; i < N ; i++) {
			sum += (int)numb[i] - 48;
		}
		
		System.out.println(sum);
	}
}
