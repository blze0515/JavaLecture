package chap99_homework.hw231026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import chap99_homework.hw231026.calculator.Calculator;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고 4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		Map<String, Integer> stMap = 
				new HashMap<String, Integer>();
		stMap.put("홍길동", 50);
		stMap.put("임꺽정", 90);
		stMap.put("조병조", 100);
		stMap.put("고기천", 70);
		
		Set<Entry<String, Integer>> entrySet = 
							stMap.entrySet();
		
		Iterator<Entry<String, Integer>> it = 
						entrySet.iterator();
		
		String name = "";
		int score = 0;
		int cnt = 0;
		
		while(it.hasNext()) {
			Entry<String, Integer> ent = 
									it.next();
			if(cnt > 0) {
				if(ent.getValue() > score) {
					score = ent.getValue();
					name = ent.getKey();
				}
			} else {
				score = ent.getValue();
				name = ent.getKey();
			}
			
			cnt++;
		}
		
		System.out.println(name + " : " + score);

//	    2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 Map<String, Integer>에 담은 후 출력하세요.
		int[] intArr = {1, 2, 3, 4, 5};
		
		//더해준 값을 담아줄 리스트
		List<Integer> intList = new ArrayList<Integer>();
		
		//출력할 Map
		Map<String, Integer> sumMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < intArr.length; i++) {
			for(int j = i + 1; j < intArr.length; j++) {
				if(j != i) {
					intList.add(
						intArr[i] + intArr[j]
					);
				}
			}
		}
		
		System.out.println(intList);
		
		for(int i = 0; i < intList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < intList.size(); j++) {
				if(i != j) {
					if(intList.get(i) == 
							intList.get(j)) {
						System.out.println(
								intList.get(i));
						sumCnt++;
					} 
				}
			}
			
			if(sumCnt > 0)
				sumMap.put(String.valueOf(
						intList.get(i)), sumCnt);
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(10, 20);
		map.put(100, 200);
		map.put(10000, 2);
		map.put(1000, 2009);
		map.put(100, 20000);
		
		System.out.println(getMaxMul(map));
		
		map.clear();
		
		for(int i = 0; i < 5; i++) {
			map.put(i, i);
		}
		printKVDesc(map);
		
		Calculator<Double> calc = 
			new Calculator<Double>(15.13, 11.99);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
		
		sc.close();
	}

//	3. key와 value 모두 Number를 상속받은 클래스의 타입을 가지고 key, value의 곱이 가장 큰
//    Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	public static <K extends Number, V extends Number> 
	Entry<K, V> getMaxMul(Map<K, V> map) {
		Entry<K, V> maxEntry = null;
		Number num = null;
		
		int index = 0;
		
		for(Entry<K, V> ent : map.entrySet()) {
			if(index == 0) {
				num = ent.getKey().doubleValue() * ent.getValue().doubleValue();
				maxEntry = ent;
			} else {
				if(num.doubleValue() < 
						ent.getKey().doubleValue() 
						* ent.getValue().doubleValue()) {
					num = ent.getKey().doubleValue() 
							* ent.getValue().doubleValue();
					maxEntry = ent;
				}
			}
			
			index++;
		}
		
		return maxEntry;		
	}
	
//	4. Map을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 제네릭 메소드를
//	   구현하세요.
	public static <K, V> void printKVDesc(Map<K, V> map) {
		List<Entry<K, V>> entList = 
					new ArrayList<Entry<K, V>>();
		
		for(Entry<K, V> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		for(int i = 0; i < entList.size(); i++) {
			System.out.println(
					entList.get(i).getKey() 
					+ " : " 
					+ entList.get(entList.size() - (i + 1)).getValue());
		}
	}
}
