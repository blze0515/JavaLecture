package chap17_collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _08_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashMap 객체 생성
		Map<String, String> carMap = new HashMap<>();
		
		// 2. Map에 데이터 추가
		carMap.put("company", "현대");
		carMap.put("model", "제네시스");
		carMap.put("color", "검정");
		carMap.put("price", "5000");
		
		System.out.println(carMap);
		
		// 3. 키 값에 해당하는 데이터 꺼내오기
		// get 메소드(Object 키값)
		System.out.println(carMap.get("company"));
		System.out.println(carMap.get("model"));
		System.out.println(carMap.get("color"));
		System.out.println(carMap.get("price"));
		
		
		// 4. keySet을 이용해서 데이터 꺼내오기
		// 키를 모를 때 사용
		Set<String> keySet = carMap.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(carMap.get(key));
		}
		
		// 5. entrySet 활용하기
		// 키와 밸류를 모두 확인하고 활요하고 싶을 때 사용
		/**
		 * {
		 * 		"company": "현대",
		 * 		"model": "제네시스",
		 * 		"color": "검정",
		 * 		"price": "5000"
		 * },
		 * {
		 * 		"company": "현대",
		 * 		"model": "제네시스",
		 * 		"color": "검정",
		 * 		"price": "5000"
		 * }
		 * 
		 * "company": "현대" => 이 한 줄이 entry
		 */
		Set<Entry<String, String>> entrySet = carMap.entrySet();
		
		Iterator<Entry<String, String>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, String> entry = entryIterator.next();
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			if(entry.getKey().equals("company")) {
				entry.setValue("기아");
			}
		}
		
		System.out.println(carMap);
		

		
		
		
		
		
	}

}
