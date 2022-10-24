package study;

import java.util.*;  // Scanner는 io   class가 아니라 util   class를 사용해야 함. 

public class ScanEx01 {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);// new == 객체를 새롭게 만든다는 연산자 
		
		String name;		// 문자열
		int age;				// 나이
		char gender;		// 성별
		double height;	// 키
		
		System.out.println("이름 입력 : ");
		//name = sc.next(); // next는 String으로 즉, 스캐너로 문자열로 입력을 받는다.  // next는 nextLine과 다르게 공백이전의 문자만 입력받아 출력.)
		name = sc.nextLine(); // nextLine 은 그 줄에 있는 문자열을 전부 입력받아 출력. 즉, 공백 상관없음.
		System.out.println("나이 입력 : ");
		age = sc.nextInt(); // nextInt 는 정수로 입력 받는다.
		
		System.out.println("성별 입력 : ");
		gender = sc.next().charAt(0);	// charAt 은 →  next의 String으로 작성된 문자열에서 문자 하나만 갖고 온다는 의미. // ()안의 숫자는 글자의 위치 자릿수를 의미.
		
		System.out.println("신장 입력 : "); 
		height = sc.nextDouble(); // nextDouble 가장큰 정수 입력 
	
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("성별 :"+gender);
		System.out.println("신장 :"+height);
		
	}
}
