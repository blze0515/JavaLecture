package chap13_nestedclass;

import chap13_nestedclass.nestedclass.LocalNestedClass;

public class _02_UseOfLocalNestedClass {
	public static void main(String[] args) {
		// 1. 지역 중첩 클래스는 따로 객체 생성이 불가능하다.
		LocalNestedClass lnc = new LocalNestedClass();
		
		lnc.speedUp();
		
//		LocalNestedClass.Engine eg = new Engine();
	}
}
