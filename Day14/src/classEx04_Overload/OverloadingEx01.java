package classEx04_Overload;

/*
 * 		메소드 오버로딩
 * 		- 하나의 클래스에서 같은 이름을 가진 메소드가 여러개 정의 되는 것을 의미함.
 * 		- 같은 이름의 메소드에 인자가 다름ex)(int a) 이거나  (int a, int b)   
 * 		- 인자가 다르다는 것은 개수가 다르거나, 자료형이 다르거나, 인수의 순서가 다르다는 것을 의미함.
 * 		   Ex)  (int a String b) 와 (String b, int a) 또한 다름!!!
 * 		- 같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아 이름을 같게 만들어 ※주 목적은 일관성을 유지함에 있음.※
 * 
 *		형식
 *		접근제한자     반환형    메소드명			    (자료형 인자, 자료형 인자....)
 *		(달라도     상관없음 )  (반드시 같아야 함)		(반드시 달라야 함)
 */


// 비 오버로딩(= 오버로딩이 아님!을 보여주기위해 만들어 봄 ↓↓↓↓↓↓↓↓)
//Why?! 메소드 명 반드시 같아야 하지만 서로 다르기 때문
public class OverloadingEx01 {
	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : "+s.length());
	}
	
	public void floatLength(float f) {
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이 : "+s.length());
	}	
	
	public void StringLength(String str) {
		System.out.println("입력한 값의 길이 : "+str.length());
	}
	
	public static void main(String[] args) {
		OverloadingEx01 oe = new OverloadingEx01();
		oe.intLength(1000);
		oe.floatLength(3.14f);
		oe.StringLength("10000");
	}
}
