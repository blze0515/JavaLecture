package chap07_class;

import java.util.ArrayList;
import java.util.List;

import chap07_class.board.Board;

public class _05_UseOfBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스는 변수로 선언해서 객체를 값으로 받아서 사용한다.
		// 따라서 클래스는 사용자가 직접 만든 타입으로 생각해도 된다.
		Board board;
		
		// 2. 클래스 내의 속성이나 기능들은 객체가 만들어진 후에 사용가능하고
		// 객체.속성명, 객체.기능명으로 사용한다.
		
		// 3. 객체를 만드는 과정은 new 키워드 + 생성자를 통해서 진행된다.
		board = new Board();
		
		board.setBoardNo(1);
		board.setBoardTitle("제목");
		board.setBoardContent("내용");
		board.setBoardWriter("작성자");
		board.setBoardDate("231020");
		
		System.out.println(board.getBoardNo());
		
		// 4. 클래스 타입의 값은 객체
		// int num의 값은 1, 10, 20;
		// Board board의 값은 new Board();
		printBoardInfo(board);
		printBoardInfo(new Board());
		
		int num =returnInt(10, 29, 30);
		
		//{1, 2, 3, 43, 5, 6,7,8....};
		int[] intArr = new int[100];
		//{new Board(), new Board(),,,,,...... new Board()}
		Board[] boardArr = new Board[100];
		
		List<Board> boardList = new ArrayList<>();
	}
	
	public static void printBoardInfo(Board board) {
		System.out.println("게시글번호: " + board.getBoardNo());
		System.out.println("게시글제목: " + board.getBoardTitle());
		System.out.println("게시글내용: " + board.getBoardContent());
		System.out.println("게시글작성자: " + board.getBoardWriter());
		System.out.println("게시글날짜: " + board.getBoardDate());
	}
	
	public static int returnInt(int a, int b, int c) {
		return a + b + c;
	}
	
	public static Board of(int boardNo, String boardTitle, 
			String boardContent, String boardWriter, 
			String boardDate) {
		return new Board(boardNo, boardTitle, boardContent, 
				boardWriter, boardDate);
	}
	
	
	
	
	
	
	
	
	
	

}
