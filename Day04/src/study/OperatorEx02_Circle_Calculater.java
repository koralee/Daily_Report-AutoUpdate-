package study;

/*		
 * 원의 넓이 r * r * PI 
 * 	원의 둘레 2*PI*r
 */


import java.util.*;
public class OperatorEx02_Circle_Calculater {

	public static void main(String[] args) {
		//System.out.println(Math.PI);
		Scanner sc = new Scanner(System.in);
		
		int r;
		double area=0.0, length=0.0;
		
		System.out.println("반지름 입력 : ");
		r = sc.nextInt();
		
		area = r*r*Math.PI;
		length = 2*r*Math.PI;
		
		System.out.printf("원의 넓이는 %.2f 입니다.\n원의 둘레는 %.2f 입니다.",area,length);
		
		
	}

}
