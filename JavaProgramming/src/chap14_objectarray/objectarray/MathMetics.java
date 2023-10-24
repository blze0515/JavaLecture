package chap14_objectarray.objectarray;

public class MathMetics extends CommonStat implements InterfaceArray {
	public MathMetics() {
		
	}
	
	public MathMetics(String subject, int studentCnt, int lectureTime) {
		super(subject, studentCnt, lectureTime);
	}

	@Override
	public void proceedLucture() {
		// TODO Auto-generated method stub
		System.out.println(this.getSubject() + " 수업을 " + 
				this.getStuduentCnt() + "명이 듣습니다. 수업시간은 " + 
				this.getLectureTime() + "분입니다.");
	}

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("미적분을 배웁니다.");
	}

}
