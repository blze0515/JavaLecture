package chap17_collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap07_class.car.CarConstructor;

public class _07_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CarConstructor> carList = new ArrayList<>();
		
		CarConstructor car = 
				new CarConstructor("현대", "제네시스", "검정", 5000);
		carList.add(car);
		
		car = 
				new CarConstructor("현대", "아반떼", "은색", 3000);
		carList.add(car);
		
		car = 
				new CarConstructor("현대", "소나타", "흰색", 4000);
		carList.add(car);
		
		car = 
				new CarConstructor("기아", "ev6", "초록", 6000);
		carList.add(car);
		
		car = 
				new CarConstructor("기아", "모하비", "빨간", 5000);
		carList.add(car);
		
		System.out.println("리스트의 데이터 개수: " + carList.size());
		
		// 1. Iterator 객체 얻기
		Iterator<CarConstructor> iterator = carList.iterator();
		
		while(iterator.hasNext()) {
			CarConstructor c = iterator.next();
			c.carInfo();
			System.out.println("---------------------");
			
			if(c.company.equals("현대")) {
				// 2. List에 있는 데이터 하나씩 삭제
				iterator.remove();
			}
		}
		
		System.out.println("리스트의 데이터 개수: " + carList.size());
		
		// 3. ListIterator 객체 얻기
		ListIterator<CarConstructor> listIterator = 
											carList.listIterator();
		
		// 4. iterator의 next()메소드를 한 번 호출하면 iterator는 
		// 다음 데이터를 가리킨다.
		listIterator.next();
		
		while(listIterator.hasPrevious()) {
			listIterator.previous();
			
			CarConstructor c = 
					new CarConstructor("쉐보레", "카마로", "노란", 4000);
			
			listIterator.set(c);
		}
		
		for(CarConstructor c : carList) {
			c.carInfo();
		}
		
		
		
		
		
		
		
		
		
	}

}
