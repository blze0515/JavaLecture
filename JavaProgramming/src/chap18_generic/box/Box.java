package chap18_generic.box;

import java.util.List;

public class Box<T> {
	private T t;
	
	private List<T> tList;
	
	public Box() {
		
	}
	
	public Box(T t) {
		this.t = t;
	}
	
	public void setBox(T t) {
		this.t = t;
	}
	
	public T getBox() {
		return this.t;
	}
	
	public void add(T t1, T t2) {
		if(t1.getClass().getSimpleName().equals("Integer")) {
			System.out.println((Integer)t1 * (Integer)t2);
		} else if(t1.getClass().getSimpleName().equals("String")) {
			System.out.println((String)t1 + t2);
		} else {
			System.out.println("Integer나 String 형태가 아닙니다.");
		}
	}
}
