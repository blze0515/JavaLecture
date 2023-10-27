package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			try {
				System.out.println(i + "! = " + bigIntegerFactorial(BigInteger.valueOf(i)));
				Thread.sleep(300);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
		
	}
	
	public static long factorial(long num) {
		if(num == 0) {
			return 1;
		} else {
			//재귀함수(메소드): 메소드안에서 해당 메소드를 다시 호출하는 것
			return num * factorial(num - 1);
		}
	}
	
	public static BigInteger bigIntegerFactorial(BigInteger bigInteger) {
		if(bigInteger.intValue() == 0) {
			return BigInteger.ONE;
		} else {
			return bigInteger.multiply(
						bigIntegerFactorial(
							bigInteger.subtract(BigInteger.ONE)
						)
					);
		}
	}
}
