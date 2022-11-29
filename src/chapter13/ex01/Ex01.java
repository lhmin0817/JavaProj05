package chapter13.ex01;

class C {
	
	int a=5;
	int b=4;
	
	int add(int a, int b) {
		return a+b;
	}
	int diff(int a, int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a /(double)b;
	}
	
	// 이너 클래스 : outer클래스의 메소드를 활용해서 기능을 구현
	class D{
		void abc() {
			System.out.println("두 수의 합은 : "+add(a,b));
			System.out.println("두 수의 뺄셈은 : "+diff(a,b));
			System.out.println("두 수의 곱셈은 : "+mul(a,b));
			System.out.println("두 수의 나누셈은 : "+div(a,b));
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		
		C c = new C();
		C.D d = c.new D();
		
		d.abc();
		
	}
}
