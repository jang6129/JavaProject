package baekJoon;

//����
//�ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
//
//���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
//
//�Է�
//�Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
//
//M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
//
//���
//M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�. 
//
//��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.

import java.util.Scanner;

public class No2581 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = Integer.parseInt(scan.nextLine());
		int N = Integer.parseInt(scan.nextLine());
		int total = 0;
		int min = 0;

		for (int i = M; i <= N; i++) {
			for (int k = 2; k <= i; k++) {
				if (k == i) {
					if (min == 0) {
						min = i;
					}
					total += i;
				} else if (i % k == 0) {
					break;
				}
			}
		}

		if (total == 0) {
			System.out.println(-1);
		} else if (total != 0) {
			System.out.println(total);
			System.out.println(min);
		}
	}
}
