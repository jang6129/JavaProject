package baekJoon;

import java.util.Scanner;

public class No1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String array[] = sentence.trim().split(" ");
		int count = array.length;
		if (array.length == 1 && array[0].equals(new String())) {
			count = 0;
		}

		System.out.print(count);
	}
}
