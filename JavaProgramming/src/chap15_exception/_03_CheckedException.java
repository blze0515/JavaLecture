package chap15_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(
					new InputStreamReader(System.in));
		
		int age = 0;
		
		// IOException은 CheckedException으로 예외처리 구문을 사용하지 않으면
		// 에러가 발생한다.
		try {
			age = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
