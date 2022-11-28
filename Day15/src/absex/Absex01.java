package absex;

public abstract class Absex01 {
	int a = 100; // 변수
	final String str = "자바가 최고야 !!!"; // 상수
	public String getStr() {  // 일반 메소드
		return str;
	}
	
	public abstract int getA();// 추상 메소드
}
