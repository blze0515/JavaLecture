package chap18_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _03_GenericMethod {
	public static void main(String[] args) {
		String[] strArr = {"java", "javascript", "html"};
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("strArr의 마지막 요소는 " + 
				_03_GenericMethod.<String>getLastEle(strArr));
		System.out.println("intArr의 마지막 요소는 " + 
				_03_GenericMethod.<Integer>getLastEle(intArr));
		
		List<Integer> intList = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			intList.add(random.nextInt(100));
		}
		
		System.out.println("intList의 마지막 요소는 " + 
				_03_GenericMethod.<Integer>getLastEle(intList));
	}
	
	// 1. 제네릭 메소드 정의
	public static <T> T getLastEle(T[] tArr) {
		return tArr[tArr.length - 1];
	}
	
	public static <T> T getLastEle(List<T> tList) {
		return tList.get(tList.size() - 1);
	}
}
