package chap17_collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _09_MapObjectValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Map 데이터 집합 한개
		 * {
		 * 		"key1": "value1",
		 * 		"key2": "value2",
		 * 		"key3": "value3"
		 * }
		 * 
		 * List 데이터 집합의 목록
		 * [
		 * 	{
		 * 		"key1": "value1",
		 * 		"key2": "value2",
		 * 		"key3": "value3"
		 * 	},
		 * 	{
		 * 		"key1": "value4",
		 * 		"key2": "value5",
		 * 		"key3": "value6"
		 * 	},
		 * 	{
		 * 		"key1": "value7",
		 * 		"key2": "value8",
		 * 		"key3": "value9"
		 * 	}
		 * ]
		 */
		// 1. Map의 Value 형태를 Object로 지정하면
		// Value에 모든 객체를 담을 수 있는 Map을 만들 수 있다.
		/**
		 * {
		 * 		"serialNo": 1234,
		 * 		"intList": [
		 * 						{
		 * 							
		 * 						},
		 * 						2,
		 * 						3,
		 * 						4,
		 * 						5 
		 * 					]
		 * 
		 * 
		 * }
		 */
		Map<String, Object> objMap = new HashMap<>();
		
		objMap.put("serialNo", 1234);
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		objMap.put("intList", intList);
		
		System.out.println(objMap);
		
		
		
		
		
		
		
		
		
		
	}

}
