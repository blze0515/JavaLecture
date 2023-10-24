package chap11_abstraction.board;

// 5. 부모클래스에 존재하는 추상 메소드를 구현하지 않으면 에러가 발생한다.
//    The type NoticeBoard must implement the inherited abstract method Board.insertBoard()
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
