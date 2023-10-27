package chap16_usefulclass;

public class _01_Object {
	public static class Example implements Cloneable {
		private int num1;
		private int num2;
		
		public Example() {
			
		}
		
		public Example(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}
		
		@Override
		public Object clone() {
			Object obj = null;
			
			try {
				//Object 클래스의 clone 메소드 호출
				obj = super.clone();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			return obj;
		}

		@Override
		public String toString() {
			return "Example [num1=" + num1 + ", num2=" + num2 + "]";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex1 = new Example();
		// Object 클래스의 clone 메소드는 깊은 복제
		// 메모리에 새로운 객체를 하나 더 생성한다.
		Example ex2 = (Example)ex1.clone();
		
		
		// Object 클래스의 equals 메소드로 같은 객체인지 비교
		if(ex2.equals(ex1)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		// 객체의 얕은 복제
		ex2 = ex1;
		
		if(ex2.equals(ex1)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		System.out.println(ex1.toString());
		System.out.println(ex2.toString());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
