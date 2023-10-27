package chap18_generic;

import java.util.HashMap;
import java.util.Map;

import chap18_generic.board.BoardFile;
import chap18_generic.board.FreeBoard;
import chap18_generic.board.NoticeBoard;

public class _01_GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. FreeBoard에 대한 BoardFile 객체 생성
		BoardFile<FreeBoard> fBoardFile = new BoardFile<>();
		
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<>();
		
		fBoardFile.setT(new FreeBoard(1, "자유게시판 제목1", "자유게시판 내용1"));
		nBoardFile.setT(new NoticeBoard(1, "공지사항1", "공지사항 내용1"));
		
//		BoardFile<String> strBoradFile = new BoardFile<>();
	}

}
