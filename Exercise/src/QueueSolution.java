
public class QueueSolution {
	public static void main(String[] args) {
		int N = 5;
		QueueEx ex = new QueueEx(N);
		for (int i = 1; i <= N; i++) {
			ex.enQueue(i);
		}
		while (!ex.isEMpty()) {
			System.out.println(ex.deQueue());
		}
	}
}
