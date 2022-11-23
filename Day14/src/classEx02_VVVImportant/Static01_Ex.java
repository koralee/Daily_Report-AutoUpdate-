package classEx02_VVVImportant;

public class Static01_Ex {
	public static void main(String[] args) {
		//System.out.println(Static01.x); // 에러 : 객체를 생성해야만 접근 가능.
		System.out.println(Static01.y); // 클래스변수이므로 객체를 생성하지 않아도 접근가능.
		Static01.y=100;
		System.out.println(Static01.y);
		
		Static01 st = new Static01();
		System.out.println("x의 초기값 = "+st.x);
		st.x=200;
		System.out.println("x의 변경값 = "+st.x);
	}

}
