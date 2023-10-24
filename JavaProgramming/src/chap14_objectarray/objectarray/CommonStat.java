package chap14_objectarray.objectarray;

public class CommonStat {
	private String subject;
	private int studuentCnt;
	private int lectureTime;
	
	public CommonStat() {
		
	}
	
	public CommonStat(String subject, int studnetCnt, 
			int lectureTime) {
		this.subject = subject;
		this.studuentCnt = studnetCnt;
		this.lectureTime = lectureTime;
	}

	public String getSubject() {
		return subject;
	}

	public int getStuduentCnt() {
		return studuentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}
}
