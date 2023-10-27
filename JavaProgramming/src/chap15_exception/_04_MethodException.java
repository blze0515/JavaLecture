package chap15_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_MethodException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			//test();
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String[] strArray = new String[4];
		
		try {
			printStrArr(strArray);
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
			System.out.println("null의 속성이나 메소드를 사용할 수 없습니다.");
		}
	}
	
	// 메소드명 뒤에 throws로 예외처리를 하면 해당 메소드가 호출되는 부분에 예외처리를 위임하는 것이다.
	// 해당 메소드를 호출하는 부분에서 예외처리를 한다.
	public static void test() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
	
		int age = 0;
	
	
		age = Integer.parseInt(in.readLine());
	}
	
	public static void printStrArr(String[] strArr) 
							throws NullPointerException{
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].length());
		}
	}
	
	
	
	
	
	
	
	
}
