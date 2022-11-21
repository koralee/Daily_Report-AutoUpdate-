package classEx04_Overload;

// 메소드 오버로딩
/*
*		형식
*		접근제한자     반환형    메소드명			    (자료형 인자, 자료형 인자....)
*		(달라도     상관없음 )  (반드시 같아야 함)		(반드시 달라야 함)
*/

public class OverloadingEx02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}	
	
	private int getLength(String str) {
	System.out.println("입력한 값의 길이 : "+str.length());
	return 0;
	}
	
	public static void main(String[] args) {
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);
		oe2.getLength(3.14f);
		oe2.getLength("10000");
	}
}
