package chap09_inherit.calc;

public class Mul extends Calculator {
	public Mul() {
		
	}
	
	public Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//오버라이딩된 메소드
	public int calculate() {
		return a * b;
	}
}
