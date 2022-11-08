package study;

/*
 * swap(교환 : 자리 바꿈)
 * 일반적인 공식 
 * 
 * int = a, b, temp;
 * temp = a;
 * a = b;
 * b = temp;

 /*--------------------------------
  *개발자들이 사용하는 swap 공식
  *		int a = 5, b = 3;
  *
  *		a = a^b;  // 5^3= 6
  *		b = b^a;  // 3^6= 5				
  *		a = a^b;  // 6^5 = 3
  */

public class BitOperatorEx03_Swap {

	public static void main(String[] args) {
		
		int a=10, b =5, temp;
		temp = a;
		
		System.out.println(a);
		System.out.println(temp);
		
		a = b;
		System.out.println(a);
		System.out.println(b);
		
		b = temp;
		System.out.println(b);
		System.out.println(temp);
		
		System.out.println(a);
		
		
		//개발자들이 사용하는 swap 공식
		int A = 5, B = 3;
		System.out.println(a +","+ b);
		A = A^B;  // 5^3= 6
		B = B^A;  // 3^6= 5
		
		
		System.out.println(a);
		System.out.println(b);
		
		A = A^B;  // 6^5 = 3
		System.out.println(a);
		
		System.out.println(a +","+ b);
		
	}

}
