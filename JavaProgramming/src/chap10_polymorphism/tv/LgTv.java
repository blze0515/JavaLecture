package chap10_polymorphism.tv;

public class LgTv extends Tv {
	public void powerOn() {
		System.out.println("제조사: 엘지");
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사: 엘지");
		//super 생성사는 항상 먼저 사용돼야 하지만
		//super.메소드, 변수는 어디서나 사용가능하다.
		super.lastChannel = 20;
		super.powerOff();
	}
	
	public void operate(int channel) {
		System.out.println("제조사: 엘지");
		super.operate(channel);
	}
	
	public void testTv() {
		//public메소드는 어디서나 접근가능
		super.powerOn();
		
		//protected 메소드는 자식클래스는 사용가능
		super.powerOff();
		
		//default 메소드는 같은 패키지 내에서만 사용가능
		super.operate(11);
		
		//private 메소드는 접근 불가능
//		super.channelUp();
	}
	
	
	
	
	
	
	
	
}
