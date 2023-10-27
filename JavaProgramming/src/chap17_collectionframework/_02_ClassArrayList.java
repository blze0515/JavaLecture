package chap17_collectionframework;

import java.util.ArrayList;
import java.util.List;

import chap07_class.car.CarConstructor;

public class _02_ClassArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [
		 * 		{
		 * 			company: "현대",
		 * 			model: "제네시스",
		 * 			color: "검정",
		 * 			price: 5000,
		 * 			메소드들.....
		 * 		},
		 * 		{
		 * 			company: "현대",
		 * 			model: "제네시스",
		 * 			color: "검정",
		 * 			price: 5000,
		 * 			메소드들.....
		 * 		},
		 * 		{
		 * 			company: "현대",
		 * 			model: "제네시스",
		 * 			color: "검정",
		 * 			price: 5000,
		 * 			메소드들.....
		 * 		},
		 * 		{
		 * 			company: "현대",
		 * 			model: "제네시스",
		 * 			color: "검정",
		 * 			price: 5000,
		 * 			메소드들.....
		 * 		},...
		 * ]
		 * 
		 * */
		List<CarConstructor> carList = new ArrayList<>();
		
		carList.add(new CarConstructor("현대", "제네시스", "검정", 5000));
		carList.add(new CarConstructor("기아", "k7", "흰색", 3000));
		
		System.out.println(carList);
		
		// 1. List에서 index에 있는 데이터 하나씩 꺼내기
		// get(int index)
		for(int i = 0; i < carList.size(); i++) {
			carList.get(i).carInfo();
		}
		
		//List도 향상 for문으로 사용가능
//		for(CarConstructor car : carList) {
//			car.carInfo();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
