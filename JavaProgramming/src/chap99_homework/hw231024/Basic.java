package chap99_homework.hw231024;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용필수).
		StringBuffer[] sbArr = new StringBuffer[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("문자열을 입력해주세요.");
			sbArr[i] = new StringBuffer(sc.nextLine());
			
			if(i > 0) {
				sbArr[0] = sbArr[0].append(sbArr[i]);
			}
		}
		
		System.out.println(sbArr[0]);
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sb1 = new StringBuffer(30);
		
		sb1 = sb1.append("hello");
		
		int len = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < len; i++) {
			sb1 = sb1.append("a");
		}
		
		System.out.println(sb1);		

//		3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
		System.out.println((double)Math.round(16.456 * 100) / 100);
		
		sc.close();
	}
}
