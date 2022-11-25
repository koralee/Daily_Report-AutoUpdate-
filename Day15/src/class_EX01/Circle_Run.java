package class_EX01;

import java.util.*;

public class Circle_Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle[] c = new Circle[3]; // 객체 배열을 선언

		for (int i = 0; i < c.length; i++) {// 입력
			System.out.print("x, y, radius : ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius); // 객체 배열 생성 및 값 저장
		}

		int max = 0;
		for (int i = 1; i < c.length; i++) {
			if (c[max].calc() < c[i].calc())
				max = i;
		}

		for (int i = 0; i < c.length; i++) {// 출력
			c[i].show();// 모든 Circle 객체 출력
		}
		System.out.print("가장 면적이 큰 원은 : ");
		c[max].show();
	}
}
