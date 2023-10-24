package chap11_abstraction.board;

// 2. 형태(껍데기)만 있는 메소드(추상 메소드)를 만드려면 클래스를 추상 클래스로 선언해야 한다.
// 추상클래스는 객체를 만들 수가 없다.(인스턴스화가 불가능하다.)
// 껍데기(형태)만 존재하는 메소드를 메모리를 저장할 수 없기 때문이다. 
// 추상 클래스는 객체를 만들 수 없기 때문에 무조건 자식클래스가 존재해야 한다.
public abstract class Board {
	int boardNo;
	String boardTitle;
	String boardContent;
	String boardWriter;
	String boardDate;
	
	public Board() {
		super();
	}
	
	public Board(int boardNo, String boardTitle, 
			String boardContent, String boardWriter, 
			String boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	// 1. 부모타입으로 자식객체를 사용하면 오버라이딩된 기능(공통기능)은 부모클래스에
	// 존재하는 기능이 전혀 동작하지 않기 때문에 부모에는 껍데기(형태)만 만들어 놓는다. => 추상화
	// 3. 추상 메소드는 상속받은 자식클래스에서 오버라이드로 동작을 만들어줘야 한다.(구현 필수)
	public abstract void insertBoard();
	
	
}
