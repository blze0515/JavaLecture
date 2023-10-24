package chap06_method.calc;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		// 같은 패키지 안에 존재하는 클래스에서는
		// public, protected, default 접근제어자까지 사용 가능
		cal.add();
		cal.sub();
		cal.mul();
	}

}
