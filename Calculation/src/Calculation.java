
public class Calculation {
	public static void main(String args[]) {
		
		Calculator numbers[] = new Calculator[3];
		numbers[0] = new Calculator(1, 2);
		
		numbers[0].addition();
		numbers[0].division();
		
		numbers[1] = new Calculator(5);
		
		numbers[1].addition();
	}
}
