package chap19_enum;

import chap19_enum.enums.Days;

public class _06_EnumEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days day = Days.FRI;
		
		
		day.printHangulDay();
		
		day = Days.SUN;
		
		day.printHangulDay();
		
	}

}
