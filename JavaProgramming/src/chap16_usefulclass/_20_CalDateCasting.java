package chap16_usefulclass;

import java.util.Calendar;
import java.util.Date;

import chap07_class.car.Car;

public class _20_CalDateCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 6, 7);
		
		// 1. Calendar 객체를 Date로 변환
		// Date 생성자에 cal의 getTimeInMills로 밀리초 단위로 값을 전달
		Date date = new Date(cal.getTimeInMillis());
		
		// 2. Date 객체를 Calendar로 변환
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar의 setTime(Date 객체)호출
		cal2.setTime(date);
		
		// println(매개변수): 매개변수로 객체를 전달하면 자동으로 toString()메소드를 호출해서 출력한다.
		System.out.println(date);
		
		Car car = new Car();
		System.out.println(car);
		
		System.out.println(cal2.get(Calendar.YEAR));
		
		
		
		
		
		
		
		
	}

}
