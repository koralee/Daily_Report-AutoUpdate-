package absex_Class3;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수와 연산자 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);

		Calc c;
		//c = new Calc(); // 추상 클래스는 객체 생성 불가!

		Calc exp = null; // 다향성을 활용!

		switch (operator) {
		case '+':
			exp = new Add();
			break;
		case '-':
			exp = new Sub();
			break;
		case '*':
			exp = new Mul();
			break;
		case '/':
			exp = new Div();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
		exp.setValue(a, b);
		if (exp instanceof Div || b == 0)
			System.out.println("계산 할 수 없습니다.");
		else
			System.out.println(exp.Calculate());
		sc.close();
	}
}
