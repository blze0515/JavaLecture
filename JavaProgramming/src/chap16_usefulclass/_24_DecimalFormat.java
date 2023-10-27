package chap16_usefulclass;

import java.text.DecimalFormat;

public class _24_DecimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 세 자리마다 콤마를 찍는 형식
		DecimalFormat df = new DecimalFormat("###,###");
		
		int price1 = 100000;
		int price2 = 30000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));
	}

}
