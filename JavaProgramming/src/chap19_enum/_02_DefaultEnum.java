package chap19_enum;

import chap19_enum.enums.DefaultMonth;

public class _02_DefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Enum은 객체처럼 사용
		// DefaultMonth.JAN 값을 갖는 열거형 객체가 하나 생성
		DefaultMonth dm = DefaultMonth.JAN;
		
		// 열거형 객체는 상수의 이름을 담고 있다.
		// 상수의 값을 출력하려면 메소드나 배열을 이용해서 출력해야한다.
		System.out.println(dm);
		
		// 2. enum의 ordinal() 메소드
		// 해당 상수의 인덱스를 알려주는 메소드
		System.out.println(dm.ordinal());
		
		// 3. enum 객체 배열을 만들어주는 value() 메소드
		// static 메소드여서 클래스명.values()
		DefaultMonth[] dmArr = DefaultMonth.values();
		
		// 4. enum 객체에 담겨있는 상수명과 name() 메소드
		// name() 메소드는 객체명.name();
		// valueOf(상수명): 상수명에 해당하는 열거형 객체를 리턴.
		for(DefaultMonth d : dmArr) {
			System.out.println(d.name() + "는(은) " 
						+ d.ordinal() + "에 있습니다.");
		}
		
	}

}
