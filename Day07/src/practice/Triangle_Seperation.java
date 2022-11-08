package practice;

/*문제
 * Scanner 클래스를 이용하여 삼각협의 변의 길이를 나타내는 정수3개를 입력
 * 이 3개의 수로 삼각형을 만들 수 있는지 판별하는 프로그램을 작성하시오
 * 
 * 삼각형이 되려면 두 변의 길이의 합이 다른 한 변의 길이 보다 커야한다.
 * 
 *  정수 3개를 입력하시오 >>
 *  삼각형 입니다.
 */
import java.util.*;
public class Triangle_Seperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("정수 3개를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a + b <=c || a+c <=b || b+c <=a) {
			System.out.println("삼각형 아닙니다.");
		}
		else {
			System.out.println("삼각형 입니다.");
		}
	}
}
