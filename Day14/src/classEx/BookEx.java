package classEx;

public class BookEx {
	// 여러 필드(변수 or 속성),메소드(=기능) 생성가능
	
	public static void Bookk() { //인스턴스 메소드  
		Book myBook = new Book();
		myBook.name = "자바의 정석";
		myBook.price = 500;
		
		System.out.println(myBook.name);
		System.out.println(myBook.price);
		// main 내부가 아니므로 출력이 안됨
	}

	public static void main(String[] args) {

		BookEx be =  new BookEx();
		be.Bookk();
		BookEx.Bookk(); // static 이므로 바로 사용 가능!
	}
}
