package chap19_enum;

import chap19_enum.enums.MethodMonth;

public class _05_MethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMonth mm = MethodMonth.JAN;
		
		// 1. enum의 static 메소드 사용
		MethodMonth.printMonths();
		
		// 2. enum의 일반 메소드 사용
		mm.printAddMonth(133);
		mm.printMonth(5);
		
		// 3. enum의 추상 메소드 사용
		mm.printHangulMonth();
		
		
		mm = MethodMonth.DEC;
		mm.printHangulMonth();
	}

}
