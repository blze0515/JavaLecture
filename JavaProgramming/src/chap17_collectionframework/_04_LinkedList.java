package chap17_collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _04_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ArrayList, LinkedList 속도비교
		// 1) 순차적으로 데이터를 넣는 속도 비교
		List<String> aList = new ArrayList<>();
		List<String> lList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			aList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 순차적으로 데이터 넣는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			lList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 순차적으로 데이터 넣는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		System.out.println("--------------------------------------");
		
		// 2) 중간에 데이터 넣는 속도 비교
		startTime = System.nanoTime();
		
		for(int i = 1000; i < 10000; i++) {
			aList.add(i, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 중간에 데이터 추가하는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		for(int i = 1000; i < 10000; i++) {
			lList.add(i, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 중간에 데이터 추가하는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		System.out.println("--------------------------------------");
		
		// 3) 인덱스로 접근할 때 속도 차이
		startTime = System.nanoTime();
		
		System.out.println(aList.get(80000));
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 80000 인덱스에 접근하는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		startTime = System.nanoTime();
		
		System.out.println(lList.get(80000));
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 80000 인덱스에 접근하는데 걸린시간: " +
				(endTime - startTime) + "나노초입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
