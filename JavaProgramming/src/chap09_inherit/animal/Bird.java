package chap09_inherit.animal;

public class Bird extends Animal {
	// 1. 오버라이딩 메소드
	public void eat() {
		System.out.println("모이를 쪼아 먹는다.");
	}
	
	public void sleep() {
		System.out.println("나뭇가지에 앉아서 잔다.");
	}
	
	public int getAge() {
		return this.age / 10;
	}
}
