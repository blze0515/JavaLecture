package chap18_generic;

import java.util.List;
import java.util.Map;

import chap18_generic.board.BoardFile;
import chap18_generic.board.FreeBoard;
import chap18_generic.board.NoticeBoard;

public class _05_LimitedGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Board를 상속받은 클래스만 제네릭으로 지정할 수 있다.
		//BoardFile<String> strBoardFile = new BoardFile<>();
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<>();
		BoardFile<FreeBoard> fBoardFile = new BoardFile<>();
	}

	
	
//   public <T> int add(List<T> longList) {
//	   return 0;
//   }
   
   public List<?> add(List<?> longList, Map<?, ?> map, BoardFile<?> boardFile) {
	   return null; 
   }
}
