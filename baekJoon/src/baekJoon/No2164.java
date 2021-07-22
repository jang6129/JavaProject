package baekJoon;

import java.util.Scanner;

//문제
//N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.
//
//이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
//
//예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.
//
//N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.
//
//출력
//첫째 줄에 남게 되는 카드의 번호를 출력한다.

public class No2164 {
	int arr[];
	int stack;
	int stackPointer;
	
	public No2164(int N) {
		arr = new int[N];
		stack = -1;
		stackPointer = 0;
	}
	
	public void pop() {
		stack--;
	}
	
	public void sendDown() {
			int top = arr[stack];
			for (int i = 1; i <= stack; i++) {
				arr[i] = arr[i-1];
			}
			arr[0] = top;
		}
	
	public void push(int n) {
		arr[++stack] = n; 
	}
	
	public boolean isEmpty() {
		return stack == -1 ? true : false;
	}
	
	public boolean isLast() {
		return stack == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		No2164 task = new No2164(N);
		
		for (int i = 0; i < N; i++) {
			task.push(N-i);
		}

		while (task.stack >= -1) {
			if (task.stack == 0) {
				System.out.println(task.arr[0]);
				break;
			}
			else {
			task.pop();
			task.sendDown();
			}
		}
	}
	
}
