package baekJoon;

import java.util.Scanner;

public class No2941 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int count = sentence.length();

		for (int i = 0; i < sentence.length(); i++) {
			if (i < sentence.length() - 1 && sentence.charAt(i) == 'c' && sentence.charAt(i + 1) == '=') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 'c' && sentence.charAt(i + 1) == '-') {
				count--;
			} else if (i < sentence.length() - 2 && sentence.charAt(i) == 'd' && sentence.charAt(i + 1) == 'z'
					&& sentence.charAt(i + 2) == '=') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 'd' && sentence.charAt(i + 1) == '-') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 'l' && sentence.charAt(i + 1) == 'j') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 'n' && sentence.charAt(i + 1) == 'j') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 's' && sentence.charAt(i + 1) == '=') {
				count--;
			} else if (i < sentence.length() - 1 && sentence.charAt(i) == 'z' && sentence.charAt(i + 1) == '=') {
				count--;
			}
		}
		System.out.println(count);
	}
}
