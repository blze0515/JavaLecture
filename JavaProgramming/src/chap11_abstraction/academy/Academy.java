package chap11_abstraction.academy;

// 1. 추상클래스 선언
public abstract class Academy {
	public int classCnt;
	public int studentCnt;
	public int teacherCnt;
	public int subjectCnt;
	
	// 2. 추상메소드 선언
	// 추상클래스가 아니면 추상메소드를 선언할 수 없다.
	public abstract void teach();
	public abstract void solveHomework();
	public abstract void rest();
	public abstract void attend();
}
