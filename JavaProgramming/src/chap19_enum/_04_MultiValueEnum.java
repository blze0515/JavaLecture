package chap19_enum;

import chap19_enum.enums.RGB;

public class _04_MultiValueEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB rgb = RGB.RED;
		
		System.out.println(rgb.getColorStr() + "는(은) " +
				rgb.getRedValue() + ", " + rgb.getGreenValue() +
				", " + rgb.getBlueValue());
		
		rgb = RGB.GREEN;
		
		System.out.println(rgb.getColorStr() + "는(은) " +
				rgb.getRedValue() + ", " + rgb.getGreenValue() +
				", " + rgb.getBlueValue());
		
		rgb = RGB.BLUE;
		
		System.out.println(rgb.getColorStr() + "는(은) " +
				rgb.getRedValue() + ", " + rgb.getGreenValue() +
				", " + rgb.getBlueValue());
	}

}
