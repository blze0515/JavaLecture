package chap12_inteface.board;

// 1. 인터페이스의 상속은 implements 키워드로 진행된다.
public class FreeBoard implements Board{

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 게시글 등록.");
	}

	@Override
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 게시글 삭제.");
	}

	@Override
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 게시글 수정.");
	}

	@Override
	public void selectBoard() {
		// TODO Auto-generated method stub
		System.out.println("자유게시판 게시글 조회.");
	}
	
	// 2. default 메소드의 오버라이드
	@Override
	public void selectBoardList() {
		System.out.println("자유게시판");
		// 3. 인터페이스의 default 메소드는 인터페이스명.super.메소드명으로 호출할 수 있다.
		Board.super.selectBoardList();
	}

}
