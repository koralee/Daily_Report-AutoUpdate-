package extend_Ex;

import java.io.*;

public class Calculater {
	public static void main(String[] args) throws IOException {
		BBB b = new BBB();
		if (!b.input()) { // true 가 아니면(== false 라면!)
			System.out.println("Error ~~~");
		} // 입력 메소드 끝
		else {
			double result = b.calc();// BBB객체의 계산기능 사용
			b.write(result);// BBB에게 상속된 AAA의 기능을 사용
		}
	}
}
