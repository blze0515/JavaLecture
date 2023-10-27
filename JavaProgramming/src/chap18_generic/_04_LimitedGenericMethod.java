package chap18_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class _04_LimitedGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> longList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			longList.add((long)5* i);
		}
		
		System.out.println(
				_04_LimitedGenericMethod.<Long>sumList(longList));
		
		System.out.println("-----------------------------");
		
		List<Number> numList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			numList.add(3 * i);
		}
		
		System.out.println(
				_04_LimitedGenericMethod.<Number>sumList(numList));
		System.out.println("-----------------------------");
		
		Map<String, Integer> map = new HashMap<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), random.nextInt(100));
			System.out.println(map.get(String.valueOf(i)));
		}
		
		System.out.println(
				_04_LimitedGenericMethod.<String, Integer>sumMapValue(map));
		System.out.println(
				_04_LimitedGenericMethod.<String, Integer>maxKey(map));
	}
	
	// 1. Number 클래스를 상속받은 타입만 지정가능한 메소드
	public static <T extends Number> double sumList(List<T> tList) {
		double sum = 0.0;
		
		for(T t : tList) {
			sum += t.doubleValue();
		}
		
		return sum;
	}
	
	// 2. Number 클래스를 상속받은 클래스만 Value로 지정가능한 메소드
	public static <K, V extends Number> int sumMapValue(Map<K, V> map) {
		int sum = 0;
		
		for(V v : map.values()) {
			sum += (int)v;
		}
		
		return sum;
	}
	
	// 3. Number 클래스를 상속받은 클래스만 Value로 지정가능한 메소드
	// Map의 Value 중 최대값의 Key를 리턴하는 메소드 maxKey
	public static <K, V extends Number> K maxKey(Map<K, V> map) {
		K maxKey = null;
		V maxValue = null;
		
		int idx = 0;
		
		for(Entry<K, V> entry : map.entrySet()) {
			if(idx == 0) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			} else {
				if(maxValue.doubleValue() < entry.getValue().doubleValue()) {
					maxKey = entry.getKey();
					maxValue = entry.getValue();
				}
			}
			
			idx++;
		}
		
//		Set<Entry<K, V>> entrySet = map.entrySet();
//		
//		Iterator<Entry<K, V>> iterator = entrySet.iterator();
//		
//		while(iterator.hasNext()) {
//			Entry<K, V> entry = iterator.next();
//			
//			if(idx == 0) {
//				maxKey = entry.getKey();
//				maxValue = entry.getValue();
//			} else {
//				if(maxValue.doubleValue() < entry.getValue().doubleValue()) {
//					maxKey = entry.getKey();
//					maxValue = entry.getValue();
//				}
//			}
//			
//			idx++;
//		}
		
		return maxKey;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
