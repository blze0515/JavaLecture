package chap13_nestedclass.nestedclass;

public class LocalNestedClass {
	public void speedUp() {
		// 1. 지역 중첩 클래스는 메소드 안에서 선언하고
		// 메소드 안에서 객체를 만들어서 사용한다.
		// 메소드의 호출이 끝나면 메모리에서 삭제되기 때문에 
		// 다른 곳에서 클래스를 사용할 수 없다.
		class Engine {
			int fuelAmount;
			
			public Engine(int fuelAmount) {
				this.fuelAmount = fuelAmount;
			}
			
			public void useFuelAmount() {
				this.fuelAmount -= 10;
			}
		}
		
		Engine eg = new Engine(100);
		eg.useFuelAmount();
		
		System.out.println("연료가 " + eg.fuelAmount + "% 남았습니다.");
	}
}
