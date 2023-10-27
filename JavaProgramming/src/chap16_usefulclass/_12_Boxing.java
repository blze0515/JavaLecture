package chap16_usefulclass;

import java.util.ArrayList;
import java.util.List;

public class _12_Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		
		// 1. 박싱: 기본자료형의 값을 래퍼클래스 객체로 만들어줌
		// 강제형변환 없이도 박싱이 일어난다.
		Integer objNum1 = (Integer)num1;
		
		// 2. 자동 박싱: 컴파일러가 알아서 기본자료형 값을 래퍼클래스의 객체로 만들어줌
		Integer objNum2 = objNum1 + num1;
		
		// 3. 언박싱: 래퍼클래스의 객체를 기본자료형의 값으로 만들어줌
		// 강제형변환 없이도 언박싱이 일어난다.
		int num2 = (int)objNum2;
		
		// 4. 자동 언박싱: 컴파일러가 알아서 래퍼클래스 객체를 기본자료형 값으로 만들어줌
		int num3 = num2 + objNum2;
		
		System.out.println("박싱: " + objNum1);
		System.out.println("자동 박싱: " + objNum2);
		System.out.println("언박싱: " + num2);
		System.out.println("자동 언박싱: " + num3);
		
		// 5. 메소드에서 자동 박싱
		printInt(num3);
		
		printInt(objNum1);
		
		// 6. 제네릭에서의 박싱
		List<Integer> list = new ArrayList<>();
		
		list.add(num3);
	}
	
	
	public static void printInt(int integer) {
		System.out.println(integer);
	}
}
