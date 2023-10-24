package chap11_abstraction.board;


// 1. 상속받은 자식 클래스는 부모클래스 타입으로도 사용이 가능하고
//    자식클래스 타입으로도 사용이 가능하다.
//    Board board = new FreeBoard();
//    FreeBoard freeBoard = new FreeBoard();
//    상속받은 클래스는 부모의 속성이나 기능들을 사용할 수 있는데
//    public, protected는 그냥 사용할 수 있고
//    default 접근제어자일 경우에는 같은 패키지내에 존재해야 사용가능
//    private 접근제어자는 아예 사용 불가능
public class FreeBoard extends Board {
	// 2. 자식 클래스는 고유의 속성이나 기능을 만들 수 있다.
	// 따라서 부모의 있는 속성, 기능 + 추가 속성, 기능을 사용할 수 있는 클래스가 된다.
	String attachFile;
	
	public FreeBoard() {
		
	}
	
	public FreeBoard(int boardNo, String boardTitle, 
			String boardContent, String boardWriter, 
			String boardDate, String attachFile) {
		super(boardNo, boardTitle, boardContent, 
				boardWriter, boardDate);
		this.attachFile = attachFile;
	}
	
	public void upload(String attachFile) {
		this.attachFile = attachFile;
		System.out.println(attachFile + "파일을 업로드합니다.");
	}
	
	
	// 3. 오버라이딩
	// 부모에 존재하는 기능을 자식에서 다른기능으로 만들어사 사용하는 것
	// 항상 부모에 존재하는 기능의 형태와 동일하게 만든다.
	@Override
	public void insertBoard() {
		System.out.println("자유게시판 게시글을 작성합니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
