package chap16_usefulclass;

public class _08_Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 1234.5678;
		
		// 1. 올림(ceil): 소수점 첫째 자리에서 올림
		System.out.println(Math.ceil(num1));
		
		// 2. 반올림(round): 소수점 첫째 자리에서 반올림
		System.out.println(Math.round(num1));
		
		// 3. 버림(floor): 소수점 첫째 자리에서 버림
		System.out.println(Math.floor(num1));
		
		// 4. 소수점 셋째 자리까지 반올림
		System.out.println((double)Math.round(num1 * 1000) / 1000);
	}

}
