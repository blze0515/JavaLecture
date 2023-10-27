package chap17_collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chap07_class.car.Car;

public class _01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. List 생성
		// List는 인터페이스라 상속받은 구현체를 객체로 만들어서 사용한다.
		// 제네릭에 타입을 지정하지 않으면 자동으로 Object로 지정된다.
		List list1 = new ArrayList();
		
		list1.add(1);
		list1.add("aaa");
		list1.add(new Car());
		list1.add(new ArrayList());
		
		// 2. subList: 지정한 인덱스 사이의 데이터를 잘라서 리스트로 리턴
		// Java 17부터는 생성자에는 제네릭을 명시하지 않아도 된다.
		// Java 17 이전에는 생성자에도 제네릭을 명시해야한다.
		// List<Integer> intList1 = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<>();

		intList1.add(4);
		intList1.add(5);
		intList1.add(3);
		intList1.add(1);
		intList1.add(2);
		
		List<Integer> intList2 = new ArrayList<>(intList1.subList(1, 3));
		
		System.out.println(intList1);
		System.out.println(intList2);
		
		// 3. 정렬
		// Collections.sort(Collection c) 메소드 사용
		// sort는 static 메소드여서 Collections 클래스에서 바로 호출한다.
		Collections.sort(intList1);
		Collections.sort(intList2);
		
		List<Integer> intList3 = new ArrayList<>(intList1.subList(1, 4));
		System.out.println(intList1);
		
		// 4. 포함여부 확인
		// containsAll(Collection c)메소드
		// contains(E e) 메소드
		if(intList1.contains(5)) {
			System.out.println("포함합니다.");
		} else {
			System.out.println("포함하지 않습니다.");
		}
		
		if(intList1.containsAll(intList2)) {
			System.out.println("포함합니다.");
		} else {
			System.out.println("포함하지 않습니다.");
		}
		
		// 5. 데이터 추가
		// add(E e): 값을 하나씩 추가
		// addAll(Collection c): c에 있는 모든 데이터 추가
		intList2.add(7);
		intList2.add(8);
		
		intList3.addAll(intList2);
		
		System.out.println(intList2);
		System.out.println(intList3);
		
		// 6. 특정 index에 데이터 수정
		// set(int index, E e)
		intList3.set(4, 10);
		intList2.set(2, 20);
		
		System.out.println(intList2);
		System.out.println(intList3);
		
		// 7. 데이터 개수를 확인
		// size()
		// capacity를 확인하는 방법은 없다
		System.out.println(intList2.size());
		System.out.println(intList3.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
