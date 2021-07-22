package baekJoon;

import java.util.Scanner;

public class No10828Guide {

	public static class Stack {
		int stackPoint;
		int arr[];

		Stack(int size) {
			arr = new int[size];
			stackPoint = -1;
		}

		public void push(int num) {
			arr[++stackPoint] = num;
		}

		public int pop() {
			return (stackPoint == -1) ? -1 : arr[stackPoint--];
		}

		public int top() {
			return (stackPoint == -1) ? -1 : arr[stackPoint];
		}

		public int empty() {
			return (stackPoint == -1) ? 1 : 0;
		}

		public int size() {
			return stackPoint + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Stack stack = new Stack(N);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			if (str.contains("push")) {
				int num = Integer.parseInt(str.split(" ")[1]);
				stack.push(num);
			} else if (str.equals("top")) {
				sb.append(stack.top() + "\n");
			} else if (str.equals("size")) {
				sb.append(stack.size() + "\n");
			} else if (str.equals("pop")) {
				sb.append(stack.pop() + "\n");
			} else if (str.equals("empty")) {
				sb.append(stack.empty() + "\n");
			}
		}
		System.out.println(sb.toString());
	}

}