package chap09_inherit;

import chap09_inherit.board.Board;
import chap09_inherit.board.FreeBoard;
import chap09_inherit.board.NoticeBoard;

public class _04_InheritBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자식클래스는 부모의 형태도 가지고 있고 자식의 형태도 가지고 있어서
		// 부모타입으로도 자식타입으로도 사용할 수 있다.
		Board board = new FreeBoard(1, "제목", "내용", 
				"작성자", "231020", "첨부파일.jpg");
		FreeBoard freeBoard = new FreeBoard(2, "자유게시판 제목",
				"자유게시판 내용", "홍길동", "231020", "java.jpg");
		NoticeBoard noticeBoard = new NoticeBoard(
				3, "공지사항게시판 제목", "공지사항게시판 내용",
				"관리자", "231020", true);
		
		// 2. 자식클래스를 부모타입으로 사용할 때는 자식클래스의 고유 속성이나
		// 기능을 사용하지 못한다.
//		board.upload("파일제목");
		freeBoard.upload("파일제목");
		
		// 3. 자식클래스를 부모타입으로 사용하면 하나의 변수로 여러가지 자식클래스를
		// 사용할 수 있다. 다양한 형태로 사용할 수 있기때문에 다형성이라고 부른다.
		// Board 타입 변수에 FreeBoard 객체를 담아서
		// 공통기능인 insertBoard()를 사용해도 FreeBoard의
		// insertBoard()가 실행된다.
		board = new FreeBoard(1, "제목", "내용", 
				"작성자", "231020", "첨부파일.jpg");
		
		board.insertBoard();
		
		// board라는 변수 하나로 NotioceBoard의 insertBoard기능도 
		// 사용할 수 있다.
		board = new NoticeBoard(
				3, "공지사항게시판 제목", "공지사항게시판 내용",
				"관리자", "231020", true);
		
		// 같은 insertBoard()라는 메소드를 사용하지만 전혀 다른 
		// 다양한 형태의 결과를 낼 수 있다. ==> 다형성
		board.insertBoard();
		
		
		
		
		
		
		
	}

}
