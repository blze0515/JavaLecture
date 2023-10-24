package chap10_polymorphism;

import chap10_polymorphism.tv.LgTv;
import chap10_polymorphism.tv.SamsungTv;
import chap10_polymorphism.tv.Tv;

public class _01_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 다형성을 이용해서 Tv를 바꾸기
		Tv tv = new LgTv();
		
		tv.powerOn();
//		tv.operate(11);
		tv.channelDown();
//		tv.channelUp();
//		tv.powerOff();
		
		// 다른 자식객체로 바꾸기
		// 변수 하나로 여러개의 객체를 사용할 수 있다.
		tv = new SamsungTv();
		
		tv.powerOn();
//		tv.operate(11);
		tv.channelDown();
//		tv.channelUp();
//		tv.powerOff();
		
		
		
		
		
		
		
		
		
		
		
	}

}
