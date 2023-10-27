package chap16_usefulclass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "computer";
		String str2 = "smartPhone";
		String str3 = "abcdha bcdeba";
		
		// 1. 문자열을 포함하는 지 여부 검사(contains) => boolean 리턴
		if(str1.contains("tP")) {
			System.out.println("str1은 tP를 포함합니다.");
		} else {
			System.out.println("str1은 tp를 포함하지 않습니다.");
		}
		
		// 2. 특정 문자의 인덱스 확인(indexOf, lastIndexOf)
		int index = 0;
		
		// indexOf는 왼쪽부터 오른쪽으로 검사
		index = str2.indexOf('h');
		System.out.println("str2에서 h의 index는 " + index);
		
		index = str3.indexOf('a', 4);
		System.out.println("str3에서 index 4부터 a의 index는 " + index);
		
		index = str3.indexOf("abc");
		System.out.println("str3에서 abc의 index는 " + index);
		
		// lastIndexOf는 오른쪽부터 왼쪽으로 검사
		index = str3.lastIndexOf('h');
		System.out.println("str3에서 h의 index는 " + index);
		
		index = str3.lastIndexOf('a', 7);
		System.out.println("str3에서 index 7부터 a의 index는 " + index);
		
		index = str3.lastIndexOf("bc");
		System.out.println("str3에서 bc의 index는 " + index);
		
		// 3. 문자열의 길이(length 메소드)
		System.out.println("str1의 길이는 " + str1.length());
		
		// 배열의 길이는 length 메소드가 아니고 length 필드 값
		int[] intArr = new int[10];
		System.out.println("intArr의 길이는 " + intArr.length);
		
		// List의 길이는 size 메소드를 사용한다.
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		System.out.println("intList의 길이는 " + intList.size());
		
		// 4. replace, replaceAll(정규표현식 사용가능)
		String str4 = "abcabcabcaabbcc";
		
		System.out.println(str4.replace("abc", "111"));
		
		System.out.println(str4.replaceAll("abc", "111"));
		
		System.out.println(str4.replaceAll("[ac]", "2"));
		
		// 체이닝기법
		// 메소드를 이어서 사용하는 것
		System.out.println(str4.replace('a', '1')
							   .replace('b', '2')
							   .replace('c', '3'));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
