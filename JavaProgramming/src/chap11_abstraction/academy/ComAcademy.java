package chap11_abstraction.academy;

public class ComAcademy extends Academy {
	//@~~~~ : 어노테이션
	//어노테이션: Java 문서에 작성하는 규칙
	//@Override: 컴파일러한테 이 메소드가 오버라이드된 메소드라는 것을 알려준다.
	//@Override 어노테이션이 없으면 컴파일러가 자식클래스에 있는 메소드와 부모클래스에 있는 
	//메소드를 비교하여 오버라이드된 메소드인지 아닌지 판단
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍을 가르친다.");
	}

	@Override
	public void solveHomework() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 숙제를 푼다.");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 수업이 끝나고 쉰다.");
	}

	@Override
	public void attend() {
		// TODO Auto-generated method stub
		System.out.println("프로그래밍 수업에 참여한다.");
	}

}
