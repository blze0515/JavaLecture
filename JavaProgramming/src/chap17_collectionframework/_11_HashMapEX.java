package chap17_collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _11_HashMapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
		}
		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		/**
		 * {
		 * 		"3": 1,
		 * 		"4": 1,
		 * 		"5": 2,
		 * 		"6": 2,
		 * 		"7": 3,
		 *  	"8": 2,
		 *  	"9": 2,
		 *		"10": 1,
		 *		"11": 1
		 * }
		 */
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		for(int i = 0; i < sumList.size(); i++) {
			int sumCnt = 1;
			
			for(int j = 0; j < sumList.size(); j++) {
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						//System.out.println(sumList.get(i));
						sumCnt++;
					} 
				}
			}
			
			if(sumCnt > 0) {
				intMap.put(String.valueOf(sumList.get(i)), sumCnt);
			}
		}
		
		System.out.println(intMap);
		
		// 합의 개수가 1인 합의 값 모두 출력
		int cnt = 0;
		
		Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		System.out.print("합의 개수의 1인 합의 값: ");
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() + ", ");
				cnt++;
			}
		}
		
		System.out.print("합의 개수의 1인 합의 값의 개수: " + cnt);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
