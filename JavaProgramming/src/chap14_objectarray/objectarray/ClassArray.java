package chap14_objectarray.objectarray;

public class ClassArray {
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public ClassArray() {
		
	}
	
	public ClassArray(String subject, int studentCnt, 
			int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}
	
	public void proceedLecture() {
		System.out.println(this.subject + " 수업을 " + this.studentCnt +
				"명의 학생이 듣습니다. 수업시간은 " + this.lectureTime + "분입니다.");
	}
}
