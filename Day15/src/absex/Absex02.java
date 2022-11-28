package absex;

public abstract class Absex02 extends Absex01{
	
	@Override
	public int getA() { // 추상메소드를 오버라이딩 된! 그냥!! 메소드
		return a;
	}
	
	public abstract String getStr(); // 추상 메소드
}
