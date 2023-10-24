package chap06_method;

import chap06_method.calc.ParameterCalculator;

public class _03_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterCalculator pcalc = new ParameterCalculator();
		
		// 1. 메소드의 사용은 항상 정의된 형태와 동일하게 호출한다.
		pcalc.add(10, 20);
		
		// 2. 매개변수 값 전달은 변수로도 가능하다.
		int num1 = 100;
		int num2 = 200;
		pcalc.add(num1, num2);
		
		// 3. 매개변수는 항상 타입, 개수, 순서가 동일해야 한다.
		double result = pcalc.div(20.0, 10);
		System.out.println(result);
		
		System.out.println(pcalc.addStr("bit", "camp"));
		
	}

}
