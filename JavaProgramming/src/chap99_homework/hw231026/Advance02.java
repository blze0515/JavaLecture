package chap99_homework.hw231026;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import chap99_homework.hw231026.group.Group;
import chap99_homework.hw231026.group.GroupA;
import chap99_homework.hw231026.group.GroupB;
import chap99_homework.hw231026.group.GroupC;
import chap99_homework.hw231026.group.GroupD;
import chap99_homework.hw231026.group.StudyGroup;

public class Advance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudyGroup<Group> studyGroup = new StudyGroup<>();
		
		List<Group> groupList = new ArrayList<>();
		
		groupList.add(new GroupA());
		groupList.add(new GroupB());
		groupList.add(new GroupC());
		groupList.add(new GroupD());
		
		studyGroup.settList(groupList);
		
		List<Entry<String, String>> captinList = studyGroup.getCaptins();
		
		System.out.println(captinList);
	}

}
