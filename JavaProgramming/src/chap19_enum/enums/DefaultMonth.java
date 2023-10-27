package chap19_enum.enums;

// 1. enum 선언
public enum DefaultMonth {
	// 2. 상수 변수 생성
	// 값을 지정하지 않으면 0부터 1씩증가하는 값이 만들어진다.
	// 기본적으로 public static final 변수로 만들어지기 때문에
	// DefaultMonth.상수이름
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SET, OCT, NOV, DEC
}
