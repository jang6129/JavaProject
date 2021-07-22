class Person {
	private int weight;
	int age;
	protected int height;
	public String name;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 28;
		height = 170;
		name = "ÀåÁø¼­";
		setWeight(60);
	}
}

public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
