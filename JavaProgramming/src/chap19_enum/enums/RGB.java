package chap19_enum.enums;

public enum RGB {
	// 1. 값이 여러개인 상수 선언
	RED("red", 255, 0, 0),
	GREEN("green", 0, 255, 0),
	BLUE("blue", 0, 0, 255);
	
	// 2. 위에서 지정한 값의 개수에 맞게 변수를 선언해야 한다.
	private String colorStr;
	private int redValue;
	private int greenValue;
	private int blueValue;
	
	// 3. 생성자 선언
	RGB(String colorStr, int redValue, int greenValue, int blueValue) {
		this.colorStr = colorStr;
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}

	// 4. getter 메소드 생성
	public String getColorStr() {
		return colorStr;
	}

	public int getRedValue() {
		return redValue;
	}

	public int getGreenValue() {
		return greenValue;
	}

	public int getBlueValue() {
		return blueValue;
	}
}
