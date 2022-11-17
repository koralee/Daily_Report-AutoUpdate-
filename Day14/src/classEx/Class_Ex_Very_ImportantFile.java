package classEx;

public class Class_Ex_Very_ImportantFile {
		int a;  // 전역변수(= 인스턴스 변수)
	
	
	public static void main(String[] args) { // mathod
		// Mathod 안에 선언한 변수를 지역변수
		// 지역변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
		// (자동 초기화 기능을 지원X)
		
		Class_Ex_Very_ImportantFile ce = new Class_Ex_Very_ImportantFile();
		
		//int a; // 지역변수
		System.out.println("ce.a = " + ce.a);   // 인스턴스 변수는 객체를 통해서 접근이 가능!
															   // 자동으로 가장 낮은 위치의 초기값을 잡아줌
		
		// 초기화를 지원하지 않기 떄문에 초기화를 해야만 사용 可能
		// 초기화의 감지는 컴파일러가 감지하여 오류를 감지, 발생 시킴
		
	}

}
