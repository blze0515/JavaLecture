package chap16_usefulclass;

import java.util.Calendar;

public class _19_DiffOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2019, 2, 11);
		
		// 1. getTimeInMills(): 현재 날짜, 시간을 밀리세컨드로 변환(long 타입)
		// 2. 두 날짜의 차이는 cal1.getTimeInMills() - cal2.getTimeInMills()
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		System.out.println("cal2부터 cal1까지 " +
					(diff / 1000) + "초가 지났습니다.");
		System.out.println("cal2부터 cal1까지 " +
				(diff / 1000 / 60) + "분가 지났습니다.");
		System.out.println("cal2부터 cal1까지 " +
				(diff / 1000 / 60 / 60) + "시간이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " +
				(diff / 1000 / 60 / 60 / 24) + "일이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " +
				(diff / 1000 / 60 / 60 / 24 / 30) + "달이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " +
				(diff / 1000 / 60 / 60 / 24 / 30 / 12) + "년이 지났습니다.");
		
		
		long diffYear = diff / ((long)1000 * 60 * 60 * 24 * 30 * 12);
		diff = diff % ((long)1000 * 60 * 60 * 24 * 30 * 12);
		long diffMonth = diff / ((long)1000 * 60 * 60 * 24 * 30);
		diff = diff % ((long)1000 * 60 * 60 * 24 * 30);
		long diffDate = diff / ((long)1000 * 60 * 60 * 24);
		diff = diff % ((long)1000 * 60 * 60 * 24);
		long diffHour = diff / ((long)1000 * 60 * 60);
		diff = diff % ((long)1000 * 60 * 60);
		long diffMinute = diff / ((long)1000 * 60);
		diff = diff % ((long)1000 * 60);
		long diffSecond = diff / 1000;
		
		System.out.println("cal2부터 cal1까지 " +
				diffYear + "년 " + diffMonth + "개월 " + diffDate +
				"일 " + diffHour + "시간 " + diffMinute + "분 " +
				diffSecond + "초 지났습니다.");
	}

}
