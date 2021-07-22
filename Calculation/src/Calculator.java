import java.util.Scanner;

public class Calculator {
	public int a;
	public int b;
	
	Calculator(int a) {
		this.a = a*10;
	}
	
	
	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	

	
	public void addition() {
		System.out.println(a+b);
	}
	
	public void subtraction() {
		System.out.println(a-b);
	}
	
	public void multiplication() {
		System.out.println(a*b);
	}
	
	public void division() {
		System.out.println(a/b);
	}
	
	public void remainder() {
		System.out.println(a%b);
	}
}
