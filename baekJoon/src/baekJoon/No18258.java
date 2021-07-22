package baekJoon;

import java.util.Scanner;

//����
//������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �� ���� �����̴�.
//
//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//�Է�
//ù° �ٿ� �־����� ����� �� N (1 �� N �� 2,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
//
//���
//����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.

public class No18258 {
	int arr[];
	int stack;
	int stackPointer;

	public No18258(int n) {
		arr = new int[n];
		stack = 0;
		stackPointer = 0;
	}

	public void push(int n) {
		arr[stack++] = n;
	}

	public int pop() {
		if (stack - stackPointer <= 0) {
			return -1;
		} else {
			return arr[stackPointer++];
		}
	}

	public int size() {
		return stack - stackPointer;
	}

	public int empty() {
		return stack - stackPointer <= 0 ? 1 : 0;
	}

	public int front() {
		if (stack - stackPointer <= 0) {
			return -1;
		} else {
			return arr[stackPointer];
		}
	}

	public int back() {
		if (stack - stackPointer <= 0) {
			return -1;
		} else {
			return arr[stack - 1];
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.nextLine());
		StringBuilder sb = new StringBuilder();
		No18258 que = new No18258(x);
		

		for (int i = 0; i < x; i++) {
			String command = scan.nextLine();
			if (command.contains("push")) {
				int n = Integer.parseInt(command.split(" ")[1]);
				que.push(n);
			} else if (command.equals("pop")) {
				sb.append(que.pop() + "\n");
			} else if (command.equals("size")) {
				sb.append(que.size() + "\n");
			} else if (command.equals("empty")) {
				sb.append(que.empty() + "\n");
			} else if (command.equals("front")) {
				sb.append(que.front() + "\n");
			} else if (command.equals("back")) {
				sb.append(que.back() + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
