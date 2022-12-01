package absex_Class3;

public abstract class Calc {  // 추상클래스
	protected int a, b;
	
	public void setValue(int a, int b) { // 일반 메소드
		this.a = a;
		this.b = b;
	}
	
	public abstract int Calculate();// 추상메소드
}
