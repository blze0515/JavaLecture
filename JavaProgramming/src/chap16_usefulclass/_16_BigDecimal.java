package chap16_usefulclass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _16_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. BigDeciaml 객체 생성
		BigDecimal bigDecimal1 = new BigDecimal(1.999999999999999999999999999999999);
		BigDecimal bigDecimal2 = BigDecimal.valueOf(3.14592);
		BigDecimal bigDecimal3 = BigDecimal.valueOf(1.234);
		
		// 2. 반올림모드
		// BigDecimal 나눌 때 오차가 발생할 수 있어서 반올림모드를 지정한다.
		// MathContext 객체를 이용해서 반올림 모드를 지정한다.
		// MathContext의 생성자를 통해서 객체를 생성하는데
		// MathContext(int 자리수, 반올림모드(RoundingMode enum 사용))
		// 자리수는 정수까지 포함된 자리수이다.
		System.out.println(bigDecimal2.divide(bigDecimal3, 
							new MathContext(4, RoundingMode.CEILING)));
		
		// 3. 소수점의 자리수를 재설정(setScale)
		// setScale(int 소수점자리, 반올림모드)
		// 현재 소수점자리보다 더 크게 설정하면 0이 자동으로 붙는데
		// 현재 소수점자리보다 더 작게 설정하면 반올림모드가 동작한다.
		System.out.println(bigDecimal2.setScale(6));
		
		System.out.println(bigDecimal2.setScale(4,
						RoundingMode.UP));
		
		
		
		
		
		
		
		
		
		
		
	}

}
