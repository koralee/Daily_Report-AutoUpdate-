package absex;

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public int getA();
}

interface Inter3 extends Inter1, Inter2 { // 인터페이스의 다중상속
	public int getData();
}

public class InterfaceEx02 implements Inter3 {
	int a = 100;

	public static void main(String[] args) {
		InterfaceEx02 ife = new InterfaceEx02();
		Inter1 ie1 = ife;
		Inter2 ie2 = ife;
		Inter3 ie3 = ife;
		
		System.out.println(ie1.getA());
		System.out.println(ie2.getA());
		System.out.println(ie3.getData());
	}

	@Override
	public int getA() { // 상속을 하는 곳에 있는 메소드가 추상 메소드이므로 상속을 받는 곳에서 오버라이딩(재정의)필수
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a + 10;
	}
}

/*	추상클래스와 인터페이스의 차이점.
 * 
 * 	- 추상클래스는 단일 상속이다.
 * - 인터페이스는 다중 상속이 가능하다.
 */

//////////////////////////////////////////////////////

/*	추상클래스와 인터페이스의 공통점.
 * 	
 * - 객체를 생성할 수 없다.
 * 	- 상속해서 하위클래스를 통하여 객체를 생성할 수 있다.
 * 	  즉, 메소드를 재정의 해야한다!!!
 */

