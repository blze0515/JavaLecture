package chap18_generic;

import java.util.HashMap;
import java.util.Map;

import chap07_class.car.CarConstructor;
import chap18_generic.box.Box;

public class _02_GenericBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> iBox = new Box<>(1000);
		Box<String> sBox = new Box<>("java");
		Box<Map<String, String>> mapBox = 
				new Box<>(new HashMap<String, String>());
		
		iBox.add(10, 20);
		sBox.add("aaa", "bbb");
		mapBox.add(new HashMap<String, String>(), 
				new HashMap<String, String>());
		
		CarConstructor car = new CarConstructor();
		Box<Integer> iBox2 = new Box<>();
	}

}
