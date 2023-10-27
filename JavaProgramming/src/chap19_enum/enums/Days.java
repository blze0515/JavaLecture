package chap19_enum.enums;

public enum Days {
	// 1. SUN("sunday" ,1) ~ SAT("saturday", 7)
	SUN("sunday", 1) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("일요일");
		}
	},
	MON("monday", 2) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("월요일");
		}
	},
	TUE("tuesday", 3) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("화요일");
		}
	},
	WED("wednesday", 4) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("수요일");
		}
	},
	THR("thursday", 5) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("목요일");
		}
	},
	FRI("friday", 6) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("금요일");
		}
	},
	SAT("saturday", 7) {
		public void printHangulDay() {
			System.out.println(this.getDay());
			System.out.println("토요일");
		}
	};
	
	// 2. 변수
	private String day;
	private int dayNum;
	
	// 3. 생성자
	Days(String day, int dayNum) {
		this.day = day;
		this.dayNum = dayNum;
	}
	
	// 4. getter
	public String getDay() {
		return this.day;
	}
	
	public int getDayNum() {
		return this.dayNum;
	}
	
	// 5. 추상매소드
	// 한글 요일을 출력하는 void printHangulDay();
	public abstract void printHangulDay();
}
