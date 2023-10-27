package chap19_enum.enums;

public enum Season {
	// 1. SPRING("봄", 3, 4, 5) ~ WINTER("겨울", 12, 1 ,2) 4개의 상수
	SPRING("봄", 3, 4, 5),
	SUMMER("여름", 6, 7, 8),
	FALL("가을", 9, 10, 11),
	WINTER("겨울", 12, 1, 2);
	
	// 2. 변수 선언
	// String 변수 하나, int[]배열 = new int[3];
	private String seasonStr;
	private int[] seasonNums = new int[3];
	
	// 3. 생성자 생성(String, int, int, int)
	Season(String seasonStr, int seasonNum0,
			int seasonNum1, int seasonNum2) {
		this.seasonStr = seasonStr;
		this.seasonNums[0] = seasonNum0;
		this.seasonNums[1] = seasonNum1;
		this.seasonNums[2] = seasonNum2;
	}
	
	// 4. getter 메소드
	public String getSeasonStr() {
		return this.seasonStr;
	}
	
	public int[] getSeasonNums() {
		return this.seasonNums;
	}
	
	// 5. 일반메소드 
	// void printSeasonMonth() => 봄은 3, 4, 5월입니다.
	public void printSeasonMonth() {
		System.out.print(this.getSeasonStr() + "는(은) ");
		
		for(int i = 0; i < this.seasonNums.length; i++) {
			if(i == this.seasonNums.length - 1) {
				System.out.print(this.seasonNums[i]);
			} else {
				System.out.print(this.seasonNums[i] + ", ");
			}
		}
		
		System.out.println("월입니다.");
	}
	
	
	
	
	
	
	
	
	
	
}
