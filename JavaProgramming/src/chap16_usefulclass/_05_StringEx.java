package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 str1, str2 문자열 2개을 입력
		// str1이 str2를 포함하면 str1에 포함된 str2를 빈칸으로 변경한 후 출력
		// 포함하지 않으면 str1은 str2를 포함하지 않습니다. 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		System.out.println("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println(str1.replace(str2, ""));
		} else {
			System.out.println("str1은 str2를 포함하지 않습니다.");
		}
		
		sc.close();
	}

}
