package chap16_usefulclass;

public class _06_StringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. StringBuffer 변수 선언 및 초기화
		
		// capacity: 버퍼의 크기
		// length: 저장된 문자열의 길이
		// 버퍼의 크기가 16인 StringBuffer가 하나 생성된다.
		// StringBuffer 생성자에는 문자열을 전달하거나 버퍼의 크기를 전달한다.
		StringBuffer sb1 = new StringBuffer("bitcamp");
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		System.out.println(sb1 == sb2);
		
		System.out.println(sb1.equals(sb2));
		
		// equals 메소드가 오버라이드되어있지 않아서 
		// 문자열의 값을 비교하려면 String으로 변환한 후 비교한다.
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		
		
		
		
		
		
	}

}
