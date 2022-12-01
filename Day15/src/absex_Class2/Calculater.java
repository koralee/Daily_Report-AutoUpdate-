package absex_Class2;

import java.util.*;

public class Calculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수와 연산자 입력 : ");
		int a = sc.nextInt(), b = sc.nextInt();
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.Calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.Calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.Calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.Calculate());
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;

		}
	}
}
