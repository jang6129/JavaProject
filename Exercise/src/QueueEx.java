
public class QueueEx {
	int arr[];
	int n;
	int front = 0;
	int rear = 0;

	QueueEx(int n) {
		this.n = n;
		arr = new int[n];
	}

	public void enQueue(int num) {
		arr[front++] = num;
	}

	public int deQueue() {
		return arr[rear++];
	}

	public boolean isEMpty() {
		return rear == front ? true : false;
	}
}
