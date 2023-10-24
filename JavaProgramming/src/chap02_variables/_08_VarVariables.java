package chap02_variables;

public class _08_VarVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. var 변수 선언 및 초기화
		var str = "hello";
		
		// 2. var 변수 선언 후 초기화를 하지 않으면 에러 발생
//		var str1;
		
		// 3. 자료형 추론이 끝난 var 변수에 다른 타입의 값을 넣으면 에러 발생
		str = "java";
//		
//		str = 10;
		
		// 4. 연산 결과의 타입을 확신할 수 없을 때 주로 사용
		int iNum = 10;
		double dNum = 11.324;
		
		var result = iNum + dNum;
		
		System.out.println(result);
	}

}
