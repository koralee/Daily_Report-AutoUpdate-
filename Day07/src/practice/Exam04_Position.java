package practice;

/*
 * 문]
 * 
 * 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표시함.
 * ()()과()()의 두점으로 이루어진 사각형이 있을 때
 * Scanner를 사용하여 x 와 y 값을 입력받고 점(x, y)가 이 직사각형 안에 있는지를
 * 판별하는 프로그램을 작성하시오.
 *
 * 출력 형식
 * 점(x,y)의 좌표를 입력하시오 >> 150, 150 
 * (150, 150)은 사각형의 좌표에 포함됩니다.
 *
 */
import java.util.*;

public class Exam04_Position {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점(x, y)의 좌표를 입력하시오. >>");
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			System.out.printf("(%d,%d)는 사격형의 좌표에 포함됩니다.", x, y);
		else
			System.out.printf("(%d,%d)는 사격형의 좌표에 포함되지 않습니다.", x, y);
	}
}
