package chap04_controlstatement;

import java.util.Scanner;

public class _09_BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 입력한 숫자까지의 구구단을 출력하세요. 0을 입력하면 종료.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요. 0은 종료.");
			
			int userNum = sc.nextInt();
			
			if(userNum == 0) {
				System.out.println("종료합니다.");
				break;
			}
			
			for(int i = 2; i <= userNum; i++) {
				for(int j = 1 ; j <= 9; j++) {
					System.out.print(i + " * " + j + " = " 
											+ (i * j) + "   ");
					
//					if(j == 3) {
//						break;
//					}
				}
				System.out.println();
			}
		}
		
		sc.close();
	}

}
