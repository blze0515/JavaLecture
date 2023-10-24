package chap10_polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap10_polymorphism.tv.MiTv;

public class _02_Object {
	public static void main(String[] args) { 
		// 1. Java의 모든 클래스들은 Object를 상속받아서 만들어진다.
		MiTv miTv = new MiTv();
		miTv.equals(miTv);
		
		Object obj = new MiTv();
		List<Object> list = new ArrayList<>();
		
		Object obj2 = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		
//		{
//			"a": "b",
//			"b": 1,
//			"c": [
//					"a",
//					"b",
//					"c",
//				 ]
//		}
		map.put("a", "b");
		map.put("b", 1);
		map.put("c", new ArrayList<String>());
		
		map.get("a");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
