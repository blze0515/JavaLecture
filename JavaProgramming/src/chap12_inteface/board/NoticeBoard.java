package chap12_inteface.board;

public class NoticeBoard implements Board {

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 등록.");
	}

	@Override
	public void deleteBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 삭제.");
	}

	@Override
	public void updateBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 수정.");
	}

	@Override
	public void selectBoard() {
		// TODO Auto-generated method stub
		System.out.println("공지사항 게시글 조회.");
	}

}
