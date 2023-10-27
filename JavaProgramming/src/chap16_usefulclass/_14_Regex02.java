package chap16_usefulclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _14_Regex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "010.*-[0-9]{4}-[0-9]{4}";
		String compare = "010-1111-123";
		
		Pattern pt = Pattern.compile(pattern);
		
		Matcher m = pt.matcher(compare);
		
		if(m.matches()) {
			System.out.println("올바른 전화번호 양식입니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
