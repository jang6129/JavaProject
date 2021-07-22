
public class ArrayList {
	int size;
	Node node[];
	int index;
	
	ArrayList(int size) {
		this.size = size;
		node = new Node[size];
		index = 0;
	}
	
	public void add(int num) {
		Node n = new Node(num);
		node[index++] = n;
	}
	
	public int get(int index) {
		return node[index].num;
	}
	
	public void delete(int index) {
		node[index] = null;
		for (int i = index; i < size - 1; i++) {
			node[i] = node[i + 1];
		}
	}
	
	public void update(int index, int num) {
		node[index].num = num;
	}	
}
