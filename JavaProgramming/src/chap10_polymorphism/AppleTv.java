package chap10_polymorphism;

import chap10_polymorphism.tv.Tv;

public class AppleTv extends Tv{
	public void testTv() {
		super.powerOn();
		
		super.powerOff();
		
//		super.operate();
//		
//		super.channelUp();
	}
}
