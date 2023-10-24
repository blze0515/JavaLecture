package chap99_homework.hw231023;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
		// 문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();

		if(str1.length() % 2 == 0) {
			System.out.println(str1.charAt(str1.length() / 2 - 1) + str1.charAt(str1.length() / 2));
		} else {
			System.out.println(str1.charAt(str1.length() / 2));
		}

		// 2. 1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
		// 단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
		char[] chArr = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

		String[] strArr = {"", "", "", ""};

		for(int i = 0; i < chArr.length; i++) {
			if(i % 4 == 0) {
				strArr[0] += chArr[i];
			} else if(i % 4 == 1) {
				strArr[1] += chArr[i];
			} else if(i % 4 == 2) {
				strArr[2] += chArr[i];
			} else if(i % 4 == 3) {
				strArr[3] += chArr[i];
			}
		}

		for(String s : strArr) {
			System.out.println(s);
		}
		
		sc.close();
	}
}
