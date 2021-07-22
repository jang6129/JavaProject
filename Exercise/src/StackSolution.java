import java.util.Stack;

public class StackSolution {
	public static void main(String args[]) {
		int N = 10;
		StackEx ex = new StackEx(N);
		for (int i = 1; i <= N; i++) {
			ex.push(i);
		}
		while (!ex.isEmpty()) {
			System.out.println(ex.pop());
		}		
	}
}
