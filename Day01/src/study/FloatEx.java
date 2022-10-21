package study;

public class FloatEx {

	/*
	 *    실수형 
	 *  		  float,      double
	 * 크기 =  4byte		8byte
	 * 실수형의 기본형은 double 이다
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		float var1, var2; // 변수의 선언
		double d;
		// 변수의 초기화
		var1 = 33.42367f;
		var2 = 55.55f;
		d = 0.214;
		
		System.out.printf("%f\n",var1);       	// %f는 소수점 6자리까지 형식을 지정함
		System.out.printf("%.2f\n",var1);    	// 소수점 2자리까지 표시
		System.out.printf("%8.2f\n",var1);    // 앞에 공백8자리 && 소수점 2자리까지 표시
		System.out.println("var2 = "+var2); 	// 소수점이 표시된 부분까지만 넣어준 것만 표시
		
		
		
	}

}