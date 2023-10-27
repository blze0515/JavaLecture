package chap16_usefulclass;

public class _09_Math02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		int num2 = -456;
		
		// 1. 절대값: abs()
		System.out.println(Math.abs(num1));
		System.out.println(Math.abs(num2));
		
		// 2. 두 수의 크기 비교(max, min)
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		// 3. 중간 정수 값: rint
		System.out.println(Math.rint(123.456));
		System.out.println(Math.rint(3.5));
	}

}
