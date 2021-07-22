package baekJoon;

//문제
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//입력
//첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
//
//출력
//주어진 수들 중 소수의 개수를 출력한다.

import java.util.Scanner;

public class No1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int arr[] = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] == 2 || arr[i] == 3) {
				count++;
			} else if (arr[i] > 4) {
				for (int k = arr[i] - 1; k >= 1; k--) {
					if (k == 1) {
						count++;
					} else if (arr[i]%k == 0) {
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
