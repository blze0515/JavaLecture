package chap09_inherit.calc;

public class Div extends Calculator {
	public Div() {
		
	}
	
	public Div(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//오버라이딩된 메소드
	public int calculate() {
		return a / b;
	}
}
