package baekJoon;

//����
//�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
//
//���
//�־��� ���� �� �Ҽ��� ������ ����Ѵ�.

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
