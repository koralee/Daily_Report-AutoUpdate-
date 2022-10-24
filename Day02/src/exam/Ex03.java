package exam;
/*문제 .3) 숫자 하나씩을 입력받는 프로그램을 작성하되, 
   두 개의 변수를 이용하여 합을 구하는 프로그램 작성*/
import java.io.*;

public class Ex03 {

	public static void main(String[] args)throws IOException {
		
		int num1, num2;  // 숫자를 하나씩 입력받을 자료형 int 인 변수를 설정. but 초기값은 입력X
		System.out.println("0~9까지 숫자를 입력 : "); // 문제 
		num1 = System.in.read()-48;  // num1 변수에 원하는 0~9까지 원하는 숫자를 입력하면
												  // 입력한 숫자의 ASCII 코드 값에서  -48이 되서 10진수로 계산되서 입력됨.
		
		System.in.skip(2);  // 키보드의 Enter와 동일
		
		System.out.println("0~9까지 숫자를 입력 : ");// num1 변수에 원하는 0~9까지 원하는 숫자를 입력하면
		num2 = System.in.read()-'0';  	   			 // 입력한 숫자의 ASCII 코드 값에서  -'0' (= 아스키코드의 0값이 48 이므로 결국 동일)이 되서 10진수로 계산되서 입력됨.		
		
		
		System.out.println("두 변수의 합 : " +(num1+num2));  //입력된 수의 값을 더해서 출력.

	}

}
