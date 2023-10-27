package chap18_generic.board;

import java.util.List;
import java.util.Map;

// 1. 제네릭 클래스 생성: <T>에 들어오는 클래스에 형태에 따라 객체의 형태가 달라지게 된다.
public class BoardFile<T extends Board> {
	private int boardNo;
	private int type;
	private String fileNm;
	// T t = new FreeBoard(1, "자유게시판 제목1", "자유게시판 내용1");
	private T t;
	
	private List<T> tList;
	
	private Map<String, T> tMap;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public List<T> gettList() {
		return tList;
	}
	public void settList(List<T> tList) {
		this.tList = tList;
	}
	public Map<String, T> gettMap() {
		return tMap;
	}
	public void settMap(Map<String, T> tMap) {
		this.tMap = tMap;
	}
	
}
