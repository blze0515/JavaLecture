package chap99_homework.hw231018;

public class Student {
	private String name;
	private int no;
	private String major;
	
	public void saveStudentInfo(String name, int no, String major) {
		this.name = name;
		this.no = no;
		this.major = major;
	}
	
	public void printStudentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학번: " + no);
		System.out.println("학과: " + major);
	}
}
