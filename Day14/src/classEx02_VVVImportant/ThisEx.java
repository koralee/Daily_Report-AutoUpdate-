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


//생성자의 오버로딩
public class ThisEx {
	public static void main(String[] args) {

		This test = new This();
		System.out.println("이름		 : "+test.getName());
		System.out.println("주민번호	 : "+test.getId());
		System.out.println("연락처 	 : "+test.getTel());
		
		System.out.println(test);	
	}
}
