package baekJoon;

import java.util.Scanner;

public class No10828 {
	int n;
	String command[];
	int arr[];
	int stack;

	public No10828(int n) {
		this.n = n;
		command = new String[n];
		arr = new int[n];
		stack = -1;
	}

	public void push(int X) {
		arr[++stack] = X;
	}

	public int pop() {
		if (stack >= 0) {
			return arr[stack--];
		} else 
		return -1;
	}

	public int size() {
		return stack + 1;
	}

	public int top() {
		if (stack >= 0) {
			return arr[stack];
		} else
		return -1;
	}

	public int empty() {
		return stack == -1 ? 1 : 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		int n = Integer.parseInt(N);
		StringBuilder sb = new StringBuilder();

		No10828 task = new No10828(n);

		for (int i = 0; i < n; i++) {
			task.command[i] = scan.nextLine();

			if (task.command[i].contains("push")) {
				String pushSize[] = task.command[i].split(" ");
				task.push(Integer.parseInt(pushSize[1]));
			} else if (task.command[i].equals("pop")) {
				if (task.empty() == 0) {
					sb.append(task.pop() + "\n");
				} else if (task.empty() == 1) {
					sb.append(-1 + "\n");
				}
			} else if (task.command[i].equals("size")) {
				sb.append(task.size() + "\n");
			} else if (task.command[i].equals("top")) {
				sb.append(task.top() + "\n");
			} else if (task.command[i].equals("empty")) {
				sb.append(task.empty() + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
