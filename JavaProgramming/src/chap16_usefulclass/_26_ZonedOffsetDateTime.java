package chap16_usefulclass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_ZonedOffsetDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		
		// 1. ZoneId 객체 생성
		ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
		ZoneId zoneId2 = ZoneId.of("Europe/Paris");
		
		// 2. LocalDateTime의 atZone메소드로 ZoneId 객체를 추가해서
		// ZonedDateTime 형식으로 변경
		ZonedDateTime zdt1 = ldt.atZone(zoneId1);
		ZonedDateTime zdt2 = ldt.atZone(zoneId2);
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		
		// 3. now() 메소드로 현재 날짜 시간 ZonedDateTime 객체 생성
		ZonedDateTime zdt3 = ZonedDateTime.now();
		
		// 4. withZoneSameInstant(ZoneId 객체)
		// onedDateTime 객체 생성하면서 ZoneId를 지정
		ZonedDateTime zdt4 = ZonedDateTime.now()
										  .withZoneSameInstant(zoneId1);
		
		System.out.println(zdt3);
		System.out.println(zdt4);
		
		// 5. toOffsetDateTime 메소드
		// ZonedDateTime 객체를 OffsetDAteTime 객체로 변환
		OffsetDateTime odt = zdt1.toOffsetDateTime();
		
		System.out.println(odt);
		
		
		
		
		
		
		
		
		
	}

}
