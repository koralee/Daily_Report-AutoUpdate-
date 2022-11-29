package absex_Class;

import java.util.*;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기를 입력 : ");
		int n = sc.nextInt();

		StringStack ss = new StringStack(n); // Stack의 크기를 잡음.

		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			if(str.equals("그만"))
				break;

			// 입력 받은 문자열을 스택에 저장한다.
			boolean res = ss.push(str);
			// Stack에 저장이 성공하면 true를 리턴

			if(res == false) {
				System.out.println("Stack이 꽉차서리 못들어감.");
			}
		}

		// 출력
		System.out.print("스택에 저장된 문자열 팝 :");
		int len = ss.length(); // 현재 스택에 저장된 개수를 의미함.
		for(int i = 0; i < len; i++) { // Stack에 저장된 개수만큼 반복
			System.out.print(ss.pop()); // Stack에서 팝메소드 호출하여 출력
		}
	}
}