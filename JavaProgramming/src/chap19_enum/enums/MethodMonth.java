package chap19_enum.enums;

// 기본적인 열거형의 형태
public enum MethodMonth {
	// 1. 상수의 값 할당
	// 첫 번째 할당된 값과 모두 동일한 타이어야 한다.
	JAN(1) {
		public void printHangulMonth() {
			System.out.println("1월");
		}
	}, 
	FEB(2) {
		public void printHangulMonth() {
			System.out.println("2월");
		}
	}, 
	MAR(3) {
		public void printHangulMonth() {
			System.out.println("3월");
		}
	}, 
	APR(4) {
		public void printHangulMonth() {
			System.out.println("4월");
		}
	}, 
	MAY(5) {
		public void printHangulMonth() {
			System.out.println("5월");
		}
	}, 
	JUN(6) {
		public void printHangulMonth() {
			System.out.println("6월");
		}
	}, 
	JUL(7) {
		public void printHangulMonth() {
			System.out.println("7월");
		}
	}, 
	AUG(8) {
		public void printHangulMonth() {
			System.out.println("8월");
		}
	}, 
	SET(9) {
		public void printHangulMonth() {
			System.out.println("9월");
		}
	}, 
	OCT(10) {
		public void printHangulMonth() {
			System.out.println("10월");
		}
	}, 
	NOV(11) {
		public void printHangulMonth() {
			System.out.println("11월");
		}
	}, 
	DEC(12) {
		public void printHangulMonth() {
			System.out.println("12월");
		}
	};
	
	// 2. 상수의 값을 담을 변수 선언
	// private 상수의 값과 동일한 타입의 변수 선언
	private int monthVal;
	
	// 3. 생성자 선언
	// 열거형 객체를 생성할 때 지정된 열거형 상수의 값이 
	// 생성자의 매개변수로 자동 전달된다.
	MethodMonth(int monthVal) {
		this.monthVal = monthVal;
	}
	
	// 4. 상수의 값을 가져오기 위한 getter 메소드
	public int getMonthVal() {
		return monthVal;
	}
	
	// 5. enum의 static 메소드 메소드 선언
	public static void printMonths() {
		MethodMonth[] mmArr = MethodMonth.values();
		
		for(MethodMonth m : mmArr) {
			System.out.println(m.name() + "는(은) " +
					m.getMonthVal() + "월 입니다.");
		}
	}
	
	
	// 6. enum의 일반 메소드 선언
	public void printMonth(int month) {
		MethodMonth[] mmArr = MethodMonth.values();
		
		for(MethodMonth m : mmArr) {
			if(m.getMonthVal() == month) {
				System.out.println("입력한 달은 " + m.getMonthVal() 
					+ "월입니다.");
			}
		}
	}
	
	// 7. 매개변수로 입력받은 개월 수 뒤의 몇월인지 출력하는 메소드
	public void printAddMonth(int month) {
		if(this.getMonthVal() + month <= 12) {
			System.out.println(month + "개월 뒤는 " + 
					(this.getMonthVal() + month) + "월입니다.");
		} else {
			int remain = month % 12;
			
			if(this.getMonthVal() + remain <= 12) {
				System.out.println(month + "개월 뒤는 " + 
						(this.getMonthVal() + remain) + "월입니다.");
			} else {
				System.out.println(month + "개월 뒤는 " + 
						(this.getMonthVal() + remain - 12) + "월입니다.");
			}
		}
	}
	
	// 8. 추상메소드 선언
	// enum의 추상메소드는 상속을 받아서 구현하는 게 아니고
	// 각각의 상수에서 구현해줘야한다.
	public abstract void printHangulMonth();
}
