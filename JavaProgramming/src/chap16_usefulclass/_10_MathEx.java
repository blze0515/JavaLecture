package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. int 5개를 담는 배열을 선언하고
		// 사용자가 정수를 5번 입력해서 배열에 저장
		// Math.max, Math.min을 이용해서 배열에 저장된 5개 정수 중
		// 최대값과 최소값을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5];
		
		for(int i = 0 ; i < intArr.length; i++) {
			System.out.println("정수를 입력하세요.");
			intArr[i] = sc.nextInt();
		}
		
		
		int max = intArr[0];
		int min = intArr[0];
		
		for(int i = 1; i < intArr.length; i++) {
			max = Math.max(max, intArr[i]);
			min = Math.min(min, intArr[i]);
		}
		
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
		sc.close();
	}

}
