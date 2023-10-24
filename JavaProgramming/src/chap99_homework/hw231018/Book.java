package chap99_homework.hw231018;

public class Book {
	private String title;
	private String author;
	private String company;
	private int price;
	
	public void saveBookInfo(String title, String author, String company, int price) {
		this.title = title;
		this.author = author;
		this.company = company;
		this.price = price;
	}
	
	public void printBookInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("출판사: " + company);
		System.out.println("가격: " + price);
	}
}
