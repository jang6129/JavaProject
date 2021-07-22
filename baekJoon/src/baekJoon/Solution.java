package baekJoon;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String array[] = str.trim().split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
