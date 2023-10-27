package chap99_homework.hw231026.group;

import java.util.HashMap;

public class GroupD extends Group{
	public GroupD() {
		super();
		
		HashMap<String, String> map = new HashMap<>();

		map.put("10", "조장");
		map.put("11", "조원");
		map.put("12", "조원");
		
		super.setMemberMap(map);
	}
}
