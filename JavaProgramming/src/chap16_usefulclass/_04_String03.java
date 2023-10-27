package chap16_usefulclass;

public class _04_String03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit-naver-cloud";
		String str2 = "kiaCar";
		String str3 = "aBcDeF";
		
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean a = true;
		
		// 1. 특정 문자로 문자열 나누기(split) -> 배열로 리턴
		String[] strArr = str1.split("-");
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		// 2. 인덱스로 문자열 자르기(substring)
		System.out.println(str2.substring(4));
		// 끝 인덱스의 문자는 포함되지 않음
		System.out.println(str2.substring(2, 4));
		
		// 3. 소문자(toLowerCase), 대문자(toUpperCase) 치환
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		// 4. 문자열 앞뒤 공백 없애기(trim)
		String str4 = "           aaabbb     cccc        ";
		System.out.println(str4.trim());
		
		// 5. 다른 타입의 값을 문자열로 변경(valueOf)
		System.out.println(String.valueOf(a).getClass().getSimpleName());
		
		System.out.println(String.valueOf(num1).getClass().getSimpleName());
		
		System.out.println(String.valueOf(num2).getClass().getSimpleName());
		
		
		
	}

}
