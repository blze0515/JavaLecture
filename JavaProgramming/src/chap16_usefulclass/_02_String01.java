package chap16_usefulclass;

public class _02_String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문자열 객체 생성
		String str1 = "bitcamp";
		// String은 불변성을 가지고 있어서 값을 변경하면 새로운 객체가 하나 생성된다.
		str1 = "naver";
		
		// 2. 생성자를 통한 문자열 생성
		String str2 = new String("naver");
		
		// 3. 같은 객체인지 비교
		if(str1 == str2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		// 4. 문자열이 같은 지 비교(equals 메소드 사용) => boolean 리턴
		// equals 메소드는 Object 클래스의 equals 메소드를 오버라이드해서 새롭게 구현한 메소드
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		
		// 5. 문자열이 같은 지 비교(compareTo 메소드 사용) => int 리턴
		// 같으면 0, 다르면 1이나 -1 리턴
		if(str1.compareTo(str2) == 0) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		// 6. 문자열 합치기
		String str3 = "cloud";
		
		String str4 = str1.concat(str3);
		
		System.out.println(str4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
