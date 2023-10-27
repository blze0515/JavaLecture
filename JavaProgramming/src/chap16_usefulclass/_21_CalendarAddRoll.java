package chap16_usefulclass;

import java.util.Calendar;

public class _21_CalendarAddRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		// 1. add메소드
		// add(더해줄 위치(YEAR, MONTH, DATE), 더할날짜)
		cal.add(Calendar.DATE, 5);
		System.out.println(calToString(cal));
		
		cal.add(Calendar.MONTH, 2);
		System.out.println(calToString(cal));
		
//		cal.add(Calendar.DATE, 3);
//		System.out.println(calToString(cal));
		
		// 2. roll메소드
		// add와 마찬가지로 날짜를 더해주는데
		// 다른 단위에 변화는 무시함
		// 지정한 단위에서만 연산이 일어난다.
		cal.roll(Calendar.DATE, 3);
		System.out.println(calToString(cal));
	}
	
	public static String calToString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " +
				(cal.get(Calendar.MONTH) + 1) + "월 " +
				cal.get(Calendar.DATE) + "일";
	}

}
