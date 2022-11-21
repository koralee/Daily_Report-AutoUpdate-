package classEx02_VVVImportant;

public class Circle {

	// 원의 반지름
	 int r;
	// 원의 이름
	 String name;
	
	// 생성자 함수   
	// 멤버 필드값을 초기화하는 목적으로 사용하는 것이므로 #생략가능
	
	 Circle(){
		//기본 생성자 : 매개변수가 없고, 아무 일없이 단순함. 
		r = 10;
		name = "";
	}
	
	Circle(int r , String n){
		//this();
		this.r = r;
		this.name = n;
		
	}
	
	// 원의 면적을 구하는 메소드
	public double getArea() {
		return 3.14 * r * r;
	}
}
