package study;

public class BitOperatorEx01 {
	public static void main(String[] args) { // 비트의 부정연산    논리연산은 참, 거짓    // 비트연산은  정수 또는 문자를 2진수로 바꿔서 계산
		
		int a = 10, b = 11;
		System.out.println("~a : "+(~a)); // ~ 는 bit의 부정  ex) 10 = 1010   이고  1010에 + 1을 해주고 부호를 바꿔준다  { !는 논리의 부정  ( 헷갈리지 마라 )}
														// 예문 11 은 1011 이고 ~11 은    11인 1011에 +1 을 해서 1100  그리고 부호 바꿔주면  -12가 나온다.
		
		System.out.println("~b : "+(~b));
	
	
	}
}
