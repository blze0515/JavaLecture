package chap16_usefulclass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_Regex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "c[a-z]*";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String compare = sc.nextLine();
		
		// 1. 정규표현식에 해당하는 Pattern 객체 생성
		Pattern pt = Pattern.compile(pattern);
		
		// 2. Pattern의 matcher메소드를 사용해 Matcher 객체 생성
		Matcher m = pt.matcher(compare);
		
		// 3. Matcher의 matches 메소드로 문자열 비교
		if(m.matches()) {
			System.out.println("compare는 소문자 c로 시작하고 소문자만 포함된 문자열입니다.");
		} else {
			System.out.println("부합하지 않습니다.");
		}
		
		sc.close();
	}

}
