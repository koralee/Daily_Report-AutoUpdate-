package study;


/* byte : 1byte 자료형이며, 입출력 범위 : -128~127
 * byte bb = -129; 또는 129 는 결국 불가능
 * 
 * 
 */


public class ByteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bb = -127;
		// java는 컴파일시에 에러가 존재할 경우 컴파일러가 에러를 발생시킨다.
		// (단 초기값일 경우!) 
		//  
		bb--;
		System.out.println(bb);
		bb++;
		System.out.println(bb);
	}

}