package chap18_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import chap18_generic.board.Board;
import chap18_generic.board.BoardFile;
import chap18_generic.board.FreeBoard;
import chap18_generic.board.NoticeBoard;

public class _06_WildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			intList.add(random.nextInt(100));
		}
		
		System.out.println("intList 요소 중 최대값은 " +
				max(intList));
		System.out.println("----------------------------");
		
		printList(intList);
		displayList(intList);
		System.out.println("----------------------------");
		
		BoardFile<?> fBoardFile = getBoardFile(new FreeBoard());
		fBoardFile = getBoardFile(new NoticeBoard());
	}
	
	// 1. 매개변수로 어떠한 타입의 리스트든 받아서 처리하는 메소드
	public static int max(List<? super Integer> list) {
		int max = (int)list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if(max < (int)list.get(i)) {
				max = (int)list.get(i);
			}
		}
		
		return max;
	}
	
	// 2. 제네릭 메소드와 와일드카드 메소드의 차이점
	public static <T> void printList(List<T> tList) {
		for(T t : tList) {
			System.out.println(t);
		}
	}
	
	public static void displayList(List<?> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static BoardFile<?> getBoardFile(Board board) {
		BoardFile<Board> boardFile = new BoardFile<>();
		
		boardFile.setT(board);
		
		return boardFile;
	}
	
	
	
	
	
	
	
}
