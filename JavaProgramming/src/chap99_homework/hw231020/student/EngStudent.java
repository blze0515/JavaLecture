package chap99_homework.hw231020.student;

public class EngStudent extends CommonStat implements Student {
	private static int cnt;
	
//	EngStudent engStudent = new EngStudent();
//	
//	EngStudent.Add add = engStudent.new Add();
//	
//	class Add{
//		int ccnt;
//		
//		public void print() {
//			System.out.println(cnt);
//		}
//	}
//	
//	static class Div {
//		
//	}
	
	public EngStudent(int sno, String name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveInfo(int index, String subject, int score) {
		// TODO Auto-generated method stub
		this.subject[index] = subject;
		this.finalExam[index] = score;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학번 : " + this.sno);
		System.out.println("이름 : " + this.name);
		System.out.println("평균 : " + this.getAvg());
		System.out.println("---------------------");
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double avg = 0;
		int sum = 0;
		
		for(int i = 0; i < this.finalExam.length; i++) {
			sum += this.finalExam[i];
		}
		
		avg = (double)Math.round(((double)sum / this.finalExam.length) * 100) / 100;
		
		return avg;
	}
}
