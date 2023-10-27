package chap19_enum.enums;

// 기본적인 열거형의 형태
public enum ValueMonth {
	// 1. 상수의 값 할당
	// 첫 번째 할당된 값과 모두 동일한 타이어야 한다.
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), 
	JUN(6), JUL(7), AUG(8), SET(9), OCT(10), 
	NOV(11), DEC(12);
	
	// 2. 상수의 값을 담을 변수 선언
	// private 상수의 값과 동일한 타입의 변수 선언
	private int monthVal;
	
	// 3. 생성자 선언
	// 열거형 객체를 생성할 때 지정된 열거형 상수의 값이 
	// 생성자의 매개변수로 자동 전달된다.
	ValueMonth(int monthVal) {
		this.monthVal = monthVal;
	}
	
	// 4. 상수의 값을 가져오기 위한 getter 메소드
	public int getMonthVal() {
		return monthVal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
