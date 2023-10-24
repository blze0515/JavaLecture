package chap09_inherit.calc;

public class Sub extends Calculator {
	public Sub() {
		
	}
	
	public Sub(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//오버라이딩된 메소드
	public int calculate() {
		return a - b;
	}
}
