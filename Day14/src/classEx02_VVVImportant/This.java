package classEx02_VVVImportant;

/*
 * 		this 와 this() 의 차이점
 * 		-	this란 특정 객체 내에서 자신이 생성되었을 때의 참조변수를 의미함.
 * 		-	객체의 주소는 객체를 생성 전 까지는 모르기 때문에 객체를 생성후 자신의 주소로 대치됨.
 * 		
 * 		this()
 * 		- 현재 객체의 생성자를 의미함.
 * 		- 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우 this()라는 키워드로 호출함.
 * 
 */


public class This {
	String name, id, tel;// 멤버 필드
	
	// 생성자를 활용해서 초기화 함.
	public This() {// 기본 생성자
		this.name = "Guest";
		this.id = "123456-1234567";
		tel = "010-1234-5678";
	}
	
	public This(String name) {//생성자의 오버로딩1
		this(); // 반드시 첫 번째 라인에 사용해야 함.
		this.name = name;
	}
	
	public This(String name, String id) {//생성자의 오버로딩2
		this(name);//생성자의 오버로딩1을 호출!
		this.id = id;
	}
	
	public This(String name, String id,String tel) {
		this(name, id);//생성자의 오버로딩2호출
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+ name +"  // 주민번호 : "+id+" // tel : "+tel;
	}
}
