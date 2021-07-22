package baekJoon;

import java.util.Scanner;

public class No1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = Integer.parseInt(s);
		String word[] = new String[n];
		int alphabet[] = new int[26];
		int count = n;

		for (int i = 0; i < n; i++) {
			word[i] = scan.nextLine();
		}
		for (int i = 0; i < word.length; i++) {
			alphabet = new int[26];
			alphabet[word[i].charAt(0) - 97] = 1;
			for (int k = 1; k < word[i].length(); k++) {
				char currentCharacter = word[i].charAt(k);
				char preCharacter = word[i].charAt(k-1);
				if (currentCharacter == preCharacter) {
					continue;
				} else if (currentCharacter != preCharacter) {
					if (alphabet[(int) currentCharacter - 97] == 0) {
						alphabet[(int) currentCharacter - 97] = 1;
					} else if (alphabet[(int) currentCharacter - 97] == 1) {
						count--;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
