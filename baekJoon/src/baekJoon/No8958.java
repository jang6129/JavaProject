package baekJoon;

import java.util.Scanner;

public class No8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String stringN = scan.nextLine();
		int N = Integer.parseInt(stringN);
		String str[] = new String[N];
		
		for(int i = 0 ; i < N ; i++) {
			str[i] = scan.nextLine();
			System.out.println(func(str[i]));
		}
	}
	
	public static int func(String str) {
		int score = 0;
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if (str.charAt(i) == 'O') {
				count++;
				score += count;
			}
			else if (str.charAt(i) == 'X') {
				count = 0;
			}
		}
		return score;
	}
}
