package chap10_polymorphism.tv;

public class SamsungTv extends Tv {
	// 오버라이딩 메소드
	public void powerOn() {
		System.out.println("제조사: 삼성");
		//부모클래스의 powerOn 메소드 호출
		//Tv 클래스의 powerOn 메소드 실행
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사: 삼성");
		super.powerOff();
	}
	
	public void operate(int channel) {
		System.out.println("제조사: 삼성");
		super.operate(channel);
	}
}
