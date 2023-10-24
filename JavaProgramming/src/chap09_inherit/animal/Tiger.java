package chap09_inherit.animal;

public class Tiger extends Animal {
	String color;
	
	public Tiger() {
		
	}
	
	public Tiger(int age, String size, int legCnt, boolean hasWing,
			String color) {
		//super(age, size, legCnt, hasWing) 
		//  == Animal(age, size, legCnt, hasWing)
		super(age, size, legCnt, hasWing);
		this.color = color;
	}
	
	// 1. 오버라이딩
	// 부모 클래스에 선언되어 있는 메소드를 자식 클래스에서 재정의하여 새로운 기능으로 사용할 수 있다.
	// 부모 클래스에 선언되어 있는 메소드와 완전 동일한 형태로 만든다.
	public void eat() {
		System.out.println("육식을 한다.");
	}
	
	public void sleep() {
		System.out.println("누워서 잔다.");
	}
	
	public int getAge() {
		return this.age * 3;
	}
	
	
	
	
	
	
	
	
	
}
