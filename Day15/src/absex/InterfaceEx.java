package absex;

public class InterfaceEx implements InterEx {
	// 클래스에서 인터페이스를 상속 받는 경우는 Extends 가 아니라 implements 가 사용된다!

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}
	
	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println(ie.getA());
	}

}
