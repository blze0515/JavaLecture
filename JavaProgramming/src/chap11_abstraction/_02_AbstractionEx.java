package chap11_abstraction;

import chap11_abstraction.tv.LgTv;
import chap11_abstraction.tv.SamsungTv;
import chap11_abstraction.tv.Tv;

public class _02_AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv(11);
		tv.powerOn();
		tv.operate(120);
		tv.powerOff();
		
		tv = new SamsungTv(5);
		tv.powerOn();
		tv.operate(24);
		tv.powerOff();
	}

}
