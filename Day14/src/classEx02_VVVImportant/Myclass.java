package classEx02_VVVImportant;

/*
 * 		생성자
 *		- 메모리 내에 객체가 생성될 때  호출되어 객체의 구조를 인식하게 하고
 *		  생성되는 멤버 변수들을 초기화하는데 목적을 둠. 
 * 		
 * 		- 생성자 명은 클래스명과 반드시 같아야 하고, return은 정의하지 말아야 한다!!!!!
 * 		- 프로그래머가 어떠한 생성자도 정의하지 않을 경우에도 컴파일러가 기본 생성자를 자동으로 정의해준다.
 * 		- 기본 생성자(=매개변수가 없는 생성자, =인자가 없는 생성자)
 * 
 * 		생성자의 접근제한자
 * 		-생성자의 접근제한을 둘 경우 해당 객체를 생성할 수 있는 접근 권한을 가짐.
 * 		-public은 어디서든 접근 가능을 의미
 * 		-생성자를 private 로 정의하면 클래스 내부에서는 접근이 가능.(이렇게 사용하는 경우는 거의 없음.)
 * 		-protected 로 정의되는 클래스는 상속관계의 객체들만 생성할 수 있음.
 * 		
 * 		생성자의 구성
 * 		[접근 제한자] [생성자명](자료형 인자1, 자료형 인자2...){
 * 		
 * 		}
 * 
 * 		생성자의 특징
 * 		1. 클래스 명과 동일하다
 * 		2. 반환형 void를 사용 할 수 없다.
 * 		3. 클래스 내부에 생성자가 없을 경우에는 컴파일러가 기본생성자를 만든다.
 * 		4. 하나의 클래스에는 인자가 다른 생성자를 여러 개를 생성할 수 있다(=생성자 오버로딩)
 * 		5. 생성자의 첫 번째 라인에서 this(인자) 생성자를 사용해서 다른 생성자를 호출할 수 있다.
 * 
 * 			this.ㅁ 는 멤버변수      //     this(인자1) 또는 this(인자1, 인자2)  는  생성자   를 의미!
 */



// 생성자 오버로딩
public class Myclass {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Myclass() {// 기본 생성자
		name = "무명";
	}

	public Myclass(String n) {//생성자의 오버로딩 1
		name = n;
	}

	public Myclass(String n, int a) {//생성자의 오버로딩 2
		name = n;
		age = a;
	}

	public Myclass(int a, String n) {//생성자의 오버로딩 3
		name = n;
		age = a;
	}
}
