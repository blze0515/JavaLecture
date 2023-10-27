package chap16_usefulclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _23_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 1. format 메소드
		// SimpleDateFormat 객체에 지정된 형식으로 날짜를 변경해서 String 형태로 리턴
		// 리턴 값이 String이라 날짜연산이 불가능하다.
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
	}

}
