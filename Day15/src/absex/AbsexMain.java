package absex;

public class AbsexMain extends Absex02 {
	public static void main(String[] args) {
		AbsexMain ae = new AbsexMain();
		
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
	}
	
	@Override
	public String getStr() { //Absex02 의 추상메소드를 재정의 한 것.
		return str; // Absex01 의 멤버변수
	}
}
