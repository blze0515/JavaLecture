package chap17_collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 입력한 문자열(StringBuilder)을 길이를 10씩 잘라서
		// ArrayList<StringBuilder>에 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		List<StringBuilder> sbList = new ArrayList<>();
		
		for(int i = 0; i < sb.length(); i += 10) {
			if(i + 10 < sb.length()) {
				sbList.add(
						new StringBuilder(
							sb.substring(i, i + 10)
						)
					);
			} else {
				sbList.add(
						new StringBuilder(
							sb.substring(i, sb.length())
						)
					);
			}
		}
		
		for(StringBuilder s : sbList) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
