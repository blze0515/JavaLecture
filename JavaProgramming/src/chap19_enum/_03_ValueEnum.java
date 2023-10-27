package chap19_enum;

import chap19_enum.enums.ValueMonth;

public class _03_ValueEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. enum 객체 생성
		// 객체가 생성되면서 생성자를 자동 호출하게 되고
		// 지정된 상수의 값이 생성자의 매개변수로 자동 전달
		ValueMonth vm = ValueMonth.JAN;
		
		// 2. enum의 상수 값
		System.out.println(vm.getMonthVal());
		
		// 3. 여러형태로 enum 객체를 만들 수 있다.
		vm = ValueMonth.valueOf("FEB");
		vm = Enum.valueOf(ValueMonth.class, "MAR");
		
		// 4. enum의 객체 배열 생성
		ValueMonth[] vmArr = ValueMonth.values();
		
		for(ValueMonth v : vmArr) {
			System.out.println(v.getMonthVal());
		}
	}

}
