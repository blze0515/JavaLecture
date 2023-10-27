package chap99_homework.hw231026.group;

import java.util.HashMap;

public class GroupC extends Group{
	public GroupC() {
		super();
		
		HashMap<String, String> map = new HashMap<>();

		map.put("7", "조장");
		map.put("8", "조원");
		map.put("9", "조원");
		
		super.setMemberMap(map);
	}
}
