import java.util.Stack;

public class StackEx {
	int arr[];
	int n;
	int stackPoint = -1;
	StackEx (int n) {
		this.n = n;
		arr = new int[n];
	}
	
	public void push(int num) {
		arr[++stackPoint] = num;
	}
	
	public int pop() {
		return arr[stackPoint--];
	}
	
	public boolean isEmpty() {
		return stackPoint == -1 ? true : false;
	}
	
}
