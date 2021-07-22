package baekJoon;

import java.util.Scanner;

//����
//N���� ī�尡 �ִ�. ������ ī��� ���ʷ� 1���� N������ ��ȣ�� �پ� ������, 1�� ī�尡 ���� ����, N�� ī�尡 ���� �Ʒ��� ���·� ������� ī�尡 ���� �ִ�.
//
//���� ������ ���� ������ ī�尡 �� �� ���� ������ �ݺ��ϰ� �ȴ�. �켱, ���� ���� �ִ� ī�带 �ٴڿ� ������. �� ����, ���� ���� �ִ� ī�带 ���� �Ʒ��� �ִ� ī�� ������ �ű��.
//
//���� ��� N=4�� ��츦 ������ ����. ī��� ���� ���������� 1234 �� ������ �����ִ�. 1�� ������ 234�� ���´�. ���⼭ 2�� ���� �Ʒ��� �ű�� 342�� �ȴ�. 3�� ������ 42�� �ǰ�, 4�� ������ �ű�� 24�� �ȴ�. ���������� 2�� ������ ����, ���� ī��� 4�� �ȴ�.
//
//N�� �־����� ��, ���� �������� ���� �Ǵ� ī�带 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ���� N(1 �� N �� 500,000)�� �־�����.
//
//���
//ù° �ٿ� ���� �Ǵ� ī���� ��ȣ�� ����Ѵ�.

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
