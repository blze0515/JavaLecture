package chap12_inteface.board;

// 1. 인터페이스: 추상클래스보다 더 추상화 레벨이 높은 클래스
// 추상클래스가 멤버변수, 인스턴스 메소드, 추상메소드를 가질 수 있었다면
// 인터페이스는 멤버변수는 static final인 변수만 가질 수 있고,
// 메소드는 추상메소드만 가질수 있다.
// 그냥 멤버변수를 선언해도 자동으로 public static final 키워드가 붙어서 생성된다.
// 메소드도 마찬가지로 그냥 메소드를 선언해도 public abstract 키워드가 붙어서 생성된다.
// 인터페이스에서 작성하는 메소드는 무조건 추상메소드이기 때문에 구현부({})을 가질 수 없다.
// 인터페이스도 추상클래스와 마찬가지로 객체를 만들지 못해서(인스턴스화 불가능) 자식클래스를 만들어야한다.
public interface Board {
	// 2. 변수는 static final 상수로 만들어지기 때문에 초기화하지 않으면 에러가 발생한다.
	int boardNo = 10;
	
	// 3. 모든 메소드가 추상메소드이기 때문에 중괄호블록({})을 사용하면 에러가 발생한다.
	// public abstract를 생략해도 자동으로 붙어서 추상메소드로 만들어진다.
	void insertBoard();
	
	void deleteBoard();
	
	void updateBoard();
	
	void selectBoard();
	
	// 4. 부모 인터페이스에 새로운 기능을 추가하려면 모든 자식클래스를 수정해야하는 문제점이 발생해서
	// defaul 메소드가 등장했다.
//	void selectBoardList();
	// 5. default 메소드는 인터페이스에서 동작을 구현해야한다.
	// default 키워드를 통해서 default 메소드를 정의할 수 있다.
	// default 메소드는 오버라이딩도 가능해서 필요한 클래스에서만 재정의할 수 있다.
	// default 메소드는 접근제어자를 생략하면 자동으로 public으로 지정된다.
	default void selectBoardList() {
		System.out.println("게시글 목록 조회");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
