package baekJoon;

import java.util.Scanner;

public class No10870 {
	public static void main(String[] args) {
//	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
//
//	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
//
//	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
//
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//
//	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//	���
//	ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(func(n));
	}

	private static int func(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return func(n - 1) + func(n - 2);
		}
	}
}
