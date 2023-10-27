package chap17_collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashSet 객체 생성
		Set<String> strSet = new HashSet<>();
		
		// 2. Set에 데이터 추가
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("JavaScript");
		strSet.add("HTML/CSS");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		// 3. Set에 중복 데이터 저장
		strSet.add("Java");
		strSet.add("JDBC");
		
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		// 4. iterator로 데이터에 하나씩 접근
		// Iterator도 Set의 제네릭형태와 동일하게 만든다
		Iterator<String> iterator = strSet.iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			
			System.out.println(str);
		}
		
		// 5. 특정 값 제거(remove)
		strSet.remove("Java");
		System.out.println(strSet);
		System.out.println(strSet.size());
		
		// 6. Set 비우기(clear)
		strSet.clear();
		if(strSet.isEmpty()) {
			System.out.println("비어있습니다.");
		} else {
			System.out.println("비어있지 않습니다.");
		}
		
		
		
		
		
	}

}
