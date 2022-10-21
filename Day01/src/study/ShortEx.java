package study;


public class ShortEx {
	/*
	 * short : 2byte, 입출력 범위 : -32768~32767
	 * 
	 * 
	 */

	public static void main(String[] args) {

		short s, i;
		s = 0;
		// 값이 할당 되지 않으면 알수 없는 값이 들어가므로 반드시 초기화를 해야 함.
		
		i=1+2+3+4+5+6+7+8+9+10;
		
		for(int k=0;k<10;k++) {
			System.out.println(k);
			System.out.println(k+k);
		}
		
		System.out.println("short s : "+s);
		System.out.println("short i : "+i);
	}
}