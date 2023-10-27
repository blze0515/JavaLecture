package chap99_homework.hw231026.group;

import java.util.HashMap;

public class GroupB extends Group{
	public GroupB() {
		super();
		
		HashMap<String, String> map = new HashMap<>();

		map.put("4", "조장");
		map.put("5", "조원");
		map.put("6", "조원");
		
		super.setMemberMap(map);
	}
}
