package chap18_generic.board;

public class FreeBoard extends Board {
	private int freeNo;
	private String freeTitle;
	private String freeContent;
	
	public FreeBoard() {
		super();
	}

	public FreeBoard(int freeNo, String freeTitle, String freeContent) {
		super();
		this.freeNo = freeNo;
		this.freeTitle = freeTitle;
		this.freeContent = freeContent;
	}

	public int getFreeNo() {
		return freeNo;
	}

	public void setFreeNo(int freeNo) {
		this.freeNo = freeNo;
	}

	public String getFreeTitle() {
		return freeTitle;
	}

	public void setFreeTitle(String freeTitle) {
		this.freeTitle = freeTitle;
	}

	public String getFreeContent() {
		return freeContent;
	}

	public void setFreeContent(String freeContent) {
		this.freeContent = freeContent;
	}
}
