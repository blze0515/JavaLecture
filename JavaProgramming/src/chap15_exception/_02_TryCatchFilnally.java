package chap15_exception;

public class _02_TryCatchFilnally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[3];
		String[] strArr = new String[3];
		
		int idx = 0;
		
		while(true) {
			try {
				// 1. ArrayIndexOutOfBoundsException 예외발생
//				System.out.println(intArr[idx++]);
				
				// 2. ArithmeticException 예외발생
//				int result = 10 / 0;
				
				// 3. NullPointerException 예외발생
				strArr[0].length();
				
				
				
				
			} catch(ArrayIndexOutOfBoundsException ae) {
				//예외 메시지 출력
				System.out.println(ae.getMessage());
				System.out.println("인덱스의 범위를 초과했습니다.");
				System.out.println("프로그램을 종료합니다.");
			} catch(ArithmeticException are) {
				System.out.println(are.getMessage());
				System.out.println("분모가 0이 될 수 없습니다.");
				break;
			} catch(NullPointerException ne) {
				System.out.println(ne.getMessage());
				System.out.println("null의 속성이나 메소드를 읽을 수 없습니다.");
				break;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("예외발생");
				break;
			} finally {
				if(idx < 3) {
					System.out.println("정상출력");
				} else {
					System.out.println("예외발생. idx를 0으로 초기화합니다.");
					idx = 0;
				}
			}
		}
	}

}
