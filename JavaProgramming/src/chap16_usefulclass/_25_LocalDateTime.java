package chap16_usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _25_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. LocalDate, LocalTime 객체 생성
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		// 2. LocalDate와 LocalTime으로 LocalDateTime 객체 생성
		LocalDateTime dateTime1 = LocalDateTime.of(date, time);
		
		// 3. LocalDate.atTime, LocalTime.atDate 메소드로 LocalDateTime 객체 생성
		LocalDateTime dateTime2 = date.atTime(time);
		LocalDateTime dateTime3 = time.atDate(date);
		
		// 4. now()로 현재 날짜시간을 갖는 LocalDateTime 객체 생성
		LocalDateTime dateTime4 = LocalDateTime.now();
		
		
		// 5. toLocalDate: 날짜만 LocalDate 객체로 만들어주는 메소드
		//    toLocalTime: 시간만 LocalTime 객체로 만들어주는 메소드
		LocalDate date2 = dateTime4.toLocalDate();
		LocalTime time2 = dateTime4.toLocalTime();
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println(dateTime4);
		System.out.println(date2 + ", " + time2);
		
		
		
		
		
		
		
		
		
	}

}
