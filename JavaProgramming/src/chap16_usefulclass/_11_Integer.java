package chap16_usefulclass;

public class _11_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Integer 객체 생성
		// 자바 9부터는 생성자 사용불가
		// valueOf 메소드를 통해서 객체를 생성한다.
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		// 기본자료형 변수는 속성이나 메소드를 사용할 수 없다.
		int num3 = 100;
		Integer num4 = Integer.valueOf(num3);
		
		// 2. 같은 객체를 사용하는 지 비교
		// valueOf로 만들어지는 객체의 값이 같으면 같은 객체를 사용한다. 
		System.out.println(num1 == num2);
		
		// 3. equals 메소드는 오버라이드가 되어있어 값이 같은지 비교한다.
		System.out.println(num1.equals(num2));
		
		// 4. compareTo: 같으면 0을 작으면 -1 크면 1을 리턴
		System.out.println(num1.compareTo(num2));
		
		// 5. 문자열을 정수형으로 변환(parseInt)
		String str = "1000";
		int convertNum = Integer.parseInt(str);
		System.out.println(convertNum);
		
		// 6. int의 최대값, 최소값을 상수로 지정해놔서
		// 바로 사용할 수 있다.
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// 7. Integer 객체를 문자열로 변환(toString)
		String convertStr = num1.toString();
		System.out.println(convertStr);
		
		// 8. 생성된 Integer 객체의 사이즈, 바이트, 타입 확인
		System.out.println(num1.SIZE);
		System.out.println(num1.BYTES);
		System.out.println(num1.TYPE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
