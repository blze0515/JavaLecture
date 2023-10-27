package chap16_usefulclass;

import java.util.Calendar;

public class _18_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar 객체 생성
		// getInstance() 메소드로 객체를 얻는다.
		// 이 때 생성되는 객체는 Calendar를 상속받은 GregorianCalendar 객체이다.
		Calendar calendar = Calendar.getInstance();
		
		// 2. 시간 표시(HOUR(0 ~ 11로 표시), HOUR_OF_DAY(0 ~ 23으로 표시))
		System.out.println("현재 시간은 " + 
				calendar.get(Calendar.HOUR_OF_DAY) + ":" +
				calendar.get(Calendar.MINUTE) + ":" +
				calendar.get(Calendar.SECOND));
		
		// 3. 오전 오후 표시(AM_PM(오전이면 0, 오후면 1))
		System.out.println(calendar.get(Calendar.AM_PM));
		
		// 4. 년 표시(YEAR)
		//    월 표시(MONTH(1월(0) ~ 12월(11)))
		//    올해의 몇 째주(WEEK_OF_YEAR)
		//    이번달의 몇 째주(WEEK_OF_MONTH)
		//    요일(DAY_OF_WEEK(일요일(1) ~ 토요일(7))
		System.out.println(calendar.get(Calendar.YEAR) + "-" +
				(calendar.get(Calendar.MONTH) + 1));
		System.out.println("올해의 몇 째주: " + 
				calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇 째주: " + 
				calendar.get(Calendar.WEEK_OF_MONTH));
		
		String[] dayOfWeek = {"", "일요일", "월요일", "화요일", "수요일", "목요일"
				, "금요일", "토요일"};
		
		System.out.println("오늘은 " + 
				dayOfWeek[calendar.get(Calendar.DAY_OF_WEEK)] + "입니다.");
		
		
		System.out.println(calendar.get(Calendar.YEAR) + "년 " +
				(calendar.get(Calendar.MONTH) + 1) + "월 " + 
				calendar.get(Calendar.DATE) + "일");
		
		System.out.println(calToString(calendar));
		
		// 5. Calendar 객체에 다른 날짜 설정
		// set 메소드 사용
		Calendar oneDay = Calendar.getInstance();
		
		oneDay.set(2023, 9, 18, 22, 54, 32);
		
		System.out.println(calToString(oneDay));
		System.out.println("ondDay의 시간은 " + 
				oneDay.get(Calendar.HOUR_OF_DAY) + ":" +
				oneDay.get(Calendar.MINUTE) + ":" +
				oneDay.get(Calendar.SECOND));
		
		
	}
	
	public static String calToString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " +
				(cal.get(Calendar.MONTH) + 1) + "월 " + 
				cal.get(Calendar.DATE) + "일";
	}
	
	
	
	
	

}
