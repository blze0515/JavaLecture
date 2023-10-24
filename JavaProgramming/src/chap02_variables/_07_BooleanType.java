package chap02_variables;

public class _07_BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 id 지정
		String userId = "java";
		
		// 2. 유효성 검사 플래그 변수 선언
		boolean isValidated = false;
		
		// 3. 사용자 id의 유효성 검사
		// String.length(): 저장된 문자열의 길이
		// 사용자 id 길이가 8이상 20이하면 유효성 통과
		if(userId.length() >= 8 && userId.length() <= 20) {
			isValidated = true;
		}
		
		// 4. 유효성을 통과했으면
		// if(isValidated) == if(isValidated == true)
		// if(!isValidted) == if(isValidated == false)
		if(isValidated) {
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		// 유효성 통과하지 못했으면
		else {
			System.out.println("아이디는 8자 이상 20자 이하로 지정해주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
