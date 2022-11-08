package study;

/* 삼항 연상자
 * 
 *  조건항 ? = if  참(true) : else 거짓(false)
 *  
 *  
 */


public class OperatorEx03_Increase_Decrease {

	public static void main(String[] args) {
		
		int a= 20, b= 30, max;
		
	/*	if( a > b ) {
			++a;
			System.out.println(a);

		}
		else if(b > a ){
			++b;
			System.out.println(b);

		}
		*/
		max = (a<b)? ++a : ++b ;
		System.out.println(max);

	}

}
