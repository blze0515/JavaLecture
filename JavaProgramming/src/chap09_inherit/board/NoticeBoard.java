package chap09_inherit.board;

public class NoticeBoard extends Board{
	boolean isAdmin;
	
	public NoticeBoard(int boardNo, String boardTitle,
			String boardContent, String boardWriter,
			String boardDate, boolean isAdmin) {
		super(boardNo, boardTitle, boardContent, boardWriter, boardDate);
		this.isAdmin = isAdmin;
	}
	
	@Override
	public void insertBoard() {
		if(this.isAdmin) {
			System.out.println("관리자가 공지사항을 등록합니다.");
		} else {
			System.out.println("공지사항은 관리자만 등록할 수 있습니다.");
		}
	}
}
