package chap03_operator;

public class _03_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 관계연산자
		int num1 = 110;
		int num2 = 225;
		
		//true
		System.out.println("num1 < num2 : " + (num1 < num2));
		//true
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		//false
		System.out.println("num1 > num2 : " + (num1 > num2));
		//false
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		//false
		System.out.println("num1 == num2 : " + (num1 == num2));
		//true
		System.out.println("num1 != num2 : " + (num1 != num2));
		
		// ==, != 기본자료형의 값만 비교할 때 사용한다.
		// 참조형 변수들은 heap 영역에 값이 저장되기 때문에
		// ==, != 을 사용하면 stack 영역에 저장된 주소값을 비교한다.
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		// String의 equals 메소드를 사용해서 값을 비교한다.
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		// 2. 논리연산자
		int num3 = 10;
		int num4 = 33;
		
		boolean result;
		
		// 논리곱(&&): 양쪽항 모두 true여야 true
		//			true     &&    true
		//                 true
		result = num1 < num2 && num3 / num4 == 0;
		System.out.println("num1 < num2 && num3 / num4 == 0 : " + result);
		
		// 논리합(||): 한쪽만 true여도 true
		//		 false ||     false
		//            false
		result = false || num2 < 100;
		System.out.println("false || num2 < 100 : " + result);
		
		// 부정(!): true는 false로 false는 true
		//			 !false
		//           true
		result = !(num4 > 2000);
		System.out.println("!(num4 > 2000) : " + result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
