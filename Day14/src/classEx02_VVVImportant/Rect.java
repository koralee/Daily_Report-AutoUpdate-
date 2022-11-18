package classEx02_VVVImportant;

/*
 *   사각형 클래스 설계
 * 
 *		넓이와 둘레를 계산하는 프로그램을 클래스로 표현
 *	
 *		순서.
 *		1. 클래스 정의 : rect
 *		2. 클래스의 속성(필드) : 가로, 세로(넓이, 둘레, 무게, 색깔, ...) 
 *		3. 클래스의 기능(메소드):입력기능, 넓이계산, 둘레계산, 가로/세로 입력, 결과출력
 * 
 * 		   	  객체 구성: 속성(필드, 변수)+ 기능(메소드, 동작, 행위)
 * 		클래스의 구성 : 변수 + 메소드
 */

import java.util.*;

public class Rect {
	// 1.)변수의 선언(가로, 세로 등)
	// 변수의 종류1-1)
	// 전역변수(공유변수, 클래스변수) : 클래스 안에서 전부 사용 가능한 변수
	// 멤버변수: 클래스에 소속되어 있는 변수
	// 인스턴스변수 : 인스턴스가 생성될 때 사용 가능한 변수
	// new 연산자에 의해서 메모리가 생성되었을 때 사용가능한 변수

	int w, h; // wide, hight

	// 2.)기능 정의(메소드) ## [ 접근제한자- Ex public] 있어도 되고 생략가능 but 생성자는 public 必
	// [void] 는 메소드 실행 후 메소드를 호출한 곳에 결과를 돌려줄 필요가 없을 때 사용

	void input() {// 수행할 일(=입력처리)
		Scanner sc = new Scanner(System.in);
		System.out.println("가로와 세로를 입력");
		System.out.print("가로 입력 : ");
		w = sc.nextInt();
		System.out.print("세로 입력 : ");
		h = sc.nextInt();
	}

	int area() {// 넓이 계산
		System.out.println();
		return w * h;
	}

	double  girth() {// 둘레 계산
		return (w+h)*2; 
	}

	// 결과 출력
	// # 매개변수를 통해서 데이터를 넘겨 받음.
	// # 메소드의 매개변수는 메소드 내에서만 사용가능
	// # 매개변수 선언시 각각의 변수마다 자료형을 따로 지정해야함.

	//area=a;girth=b;

	void output(int aa, double bb) { // a== wide // b==hight
		System.out.println("가로 : " + w + ", 세로 : " + h);
		System.out.println("넓이 : " + aa + ", 둘레 : " + bb);
	}

}
