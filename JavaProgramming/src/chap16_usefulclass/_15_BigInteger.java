package chap16_usefulclass;

import java.math.BigInteger;

public class _15_BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. BigInteger 객체 생성
		BigInteger bigInt1 = new BigInteger("10000000000000000000000000");
		BigInteger bigInt2 = BigInteger.valueOf(30000000000000L);
		
		System.out.println(bigInt1);
		System.err.println(bigInt2);
		
		System.out.println(bigInt1.getClass().getSimpleName());
		
		// 2. 타입변환
		String str = bigInt1.toString();
		long num = bigInt2.longValue();
		
		System.out.println(str);
		System.out.println(num);
		
		// 3. 연산
		System.out.println(bigInt1.add(bigInt2));
		System.out.println(bigInt1.subtract(bigInt2));
		System.out.println(bigInt1.multiply(bigInt2));
		System.out.println(bigInt1.divide(bigInt2));
		System.out.println(bigInt1.remainder(bigInt2));
		
		
		
		
		
		
		
		
		
		
	}

}
