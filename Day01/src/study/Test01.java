package study;


public class Test01 {

	public static void main(String[] args) {
		// 변수선언 방법
		// 자료형 + 변수명
		int a, b;
		a = 100;
		b = 300;
		char aa;
		int bb, cc, dd;
		aa = 'A';
		bb = (int)aa;
		cc = bb+1;
		dd = cc;
		System.out.printf("%c\n", aa);
		System.out.printf("%d\n", bb);
		System.out.printf("%c\n", cc);
		System.out.printf("%d\n\n", dd);
		System.out.printf("%d\n", a);
		System.out.printf("%d\n", b);
		System.out.printf("%d\n", b / a);
		System.out.println("100 + 100"); // 문자열로 표현
		System.out.println(100 + 100); // 값을 그대로 표현
		
	}
}