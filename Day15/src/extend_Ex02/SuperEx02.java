package extend_Ex02;

public class SuperEx02 extends SuperEx01 {

	protected int b = 100;

	public void print() {// superEx02 클래스의 인스턴스 메소드
		// System.out.println("SuperEX02 print() 메소드 : "+a+b+c); // 부모클래스에서 선언된 a는
		// private 라서 접근 불가
		System.out.println("SuperEX02 print() 자식1 메소드 : " + super.b + " " + c);
	}

	@Override
	public void write() { // 오버라이딩 (불러서 사용하는 호출이 아닌!!! 재정의 라는 것을 인지하기!)
		System.out.println("SuperEX02 print() 자식2 메소드 : "  + b + " " + c);
	}
}
