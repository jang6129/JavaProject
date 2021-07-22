package baekJoon;

//����
//���ڴ� ���� ����̴� ���Ƹ� ȸ���� �غ��ϱ� ���ؼ� ��θ� �����ϴ� ���̴�.
//
//�����̴� ����̸� ���ͼ� ���� �����ϴ� ���ε�, �ּ��ϰԵ� �׻� ���ž��� �����̴� ���� �Ǽ��� �߸� �θ��� ��� ġ�� �Ͼ�����.
//
//�����̴� �߸��� ���� �θ� ������ 0�� ���ļ�, ���� �ֱٿ� ����̰� �� ���� ����� ��Ų��.
//
//����̴� �̷��� ��� ���� �޾� ���� �� �� ���� ���� �˰� �;� �Ѵ�. ����̸� ��������!
//
//�Է�
//ù ��° �ٿ� ���� K�� �־�����. (1 �� K �� 100,000)
//
//���� K���� �ٿ� ������ 1���� �־�����. ������ 0���� 1,000,000 ������ ���� ������, ������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.
//
//������ "0"�� ��쿡 ���� �� �ִ� ���� ������ ������ �� �ִ�.
//
//���
//����̰� ���������� ���� �� ���� ���� ����Ѵ�. ���������� ��� ���� ���� 231-1���� �۰ų� ���� �����̴�.

import java.util.Scanner;

public class No10773 {
	int K;
	int arr[];
	int stackPoint;

	public No10773(int N) {
		int K = N;
		arr = new int[K];
		stackPoint = -1;
	}

	public void push(int num) {
		if (num > 0)
			arr[++stackPoint] = num;
		else if (num == 0)
			stackPoint--;
	}

	public int pop() {
		return arr[stackPoint--];
	}

	public boolean isEmpty() {
		return stackPoint == -1 ? true : false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int total = 0;

		No10773 task = new No10773(K);

		for (int i = 0; i < K; i++) {
			task.push(scan.nextInt());
		}

		while (!task.isEmpty()) {
			total += task.pop();
		}

		System.out.println(total);
	}
}
