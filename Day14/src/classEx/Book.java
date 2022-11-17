package classEx;

//클래스 정의
public class Book {	// 클래스 해더
	// 멤버 필드(=변수 또는 속성) Ex) 책을 봤을 때 외관적으로 있는 것들// 제목, 가격, 저자 등
	String name;		// 이름
	String writer;		// 저자
	int price;			// 가격
	int nowpage;		// 현재 페이지
	String jsbn;
	
	
	// 생성자
	public Book() {}
	
	// 멤버 메소드
	public void nextPage() {nowpage++;}		// 다음 페이지
	public void previousPage() {nowpage--;}	// 이전 페이지

}
