//class A {
//	public A() {
//		System.out.println("생성자A");
//	}
//	public A(int x) {
//		System.out.println("매개변수생성자A" + x);
//	}
//} 
//
//class B extends A {
//	public B() {
//		System.out.println("생성자B");
//	}
//	public B(int x) {
//		super(x); // super()는 반드시 첫 줄에 와야 한다.
//		System.out.println("매개변수생성자B" + x);
//	}
//}
//
//public class ConstructorEx4 {
//	public static void main(String[] args) {
//		B b;
//		b = new B(5);
//	}
//}
//// 실행 결과
//// 매개변수생성자A5
//// 매개변수생성자B5