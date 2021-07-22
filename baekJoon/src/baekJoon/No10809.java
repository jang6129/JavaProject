package baekJoon;

import java.util.Scanner;

public class No10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int alphabet[] = new int[26];
		
		for (int i = 0 ; i < 26; i++) {
			alphabet[i] = -1;
		}
		
		for (int i = 0 ; i < word.length(); i++) {
			if (alphabet[(int)word.charAt(i)-97] == -1 ) {
			alphabet[(int)word.charAt(i)-97] = i;
			}
		}
		
		for (int i = 0 ; i < 26 ; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
