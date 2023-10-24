package chap02_variables;

public class _09_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 상수 선언 및 초기화
		final int MAX_STUDENT_COUNT = 30;
		final int CURRENT_STUDENT_COUNT = 16;
		
		System.out.println("강의실의 빈자리는 : " 
				+ (MAX_STUDENT_COUNT - CURRENT_STUDENT_COUNT));
		
		// 상수는 선언하고 나중에 초기화해도 무방하다.
		final double PI;
		
		PI = 3.14;
		
		// 2. 상수에 값이 한 번 저장되면 값을 변경할 수 없다.
//		PI = 11.456;
		
		// 3. 지정된 상수를 이용한 연산
		int radius = 10;
		
		System.out.println("반지름이 10인 원의 둘레 : " + (2 * PI * radius));
		System.out.println("반지름이 20인 원의 넓이 : " + (PI * 20 * 20));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
