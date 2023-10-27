package chap17_collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list = createStringList();
		System.out.println(list);
	}
	
	
	// 사용자가 입력한 5개의 문자열을 List<String>에 저장해서 리턴하는 메소드를 만드세요.
	public static List<String> createStringList() {
		Scanner sc = new Scanner(System.in);
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열을 입력하세요.");
			strList.add(sc.nextLine());
		}
		
		sc.close();
		
		return strList;
	}
}
