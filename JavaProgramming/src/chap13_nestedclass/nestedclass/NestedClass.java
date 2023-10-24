package chap13_nestedclass.nestedclass;

public class NestedClass {
	// 1. 멤버변수
	public static int num1;
	public static int num2;
	
	// 2. 메소드
	public int add() {
		return num1 + num2;
	}
	
	// 3. 정적 중첩 클래스
	// 외부클래스의 객체 생성없이도 사용할 수 있다.
	public static class Mul {
		public Mul() {
			num1 = 100;
			num2 = 20;
		}
		
		public int mul() {
			return num1 * num2;
		}
	}
	
	// 4. 인스턴스 중첩 클래스
	// 외부클래스의 객체를 생성한 후에 사용할 수 있다.
	public class Div {
//		public int num3;
//		public static int num4;
		
		public Div() {
			num1 = 100;
			num2 = 20;
		}
		
		public int div() {
			return num1 / num2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
