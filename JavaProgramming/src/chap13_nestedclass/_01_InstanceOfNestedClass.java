package chap13_nestedclass;

import chap13_nestedclass.nestedclass.NestedClass;

public class _01_InstanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정적 중첩 클래스의 객체 생성
		NestedClass.Mul mul = new NestedClass.Mul();
		
		int result = mul.mul();
		System.out.println(result);
		
		// 2. 인스턴스 중첩 클래스의 객체 생성
		NestedClass nc = new NestedClass();
		
		NestedClass.Div div = nc.new Div();
		result = div.div();
		System.out.println(result);
	}
	
}
