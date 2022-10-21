package study;

/* 문자열 입력받기
 * 
 * @@@@@ 문자열을 받기위한 버퍼를 만드는 방법 @@@@@
 * InputStreamReader is = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(is);
 * 
 *  또는   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *  
 *  위 둘중 아무거나 편한 걸 사용.  
 */


import java.io.*;
public class InputEx03 {

	public static void main(String[] args)throws IOException {
		
		
		 // InputStreamReader is = new InputStreamReader(System.in);
		 // BufferedReader br = new BufferedReader(is);
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		  System.out.print("이름 입력 	=");
		  String name = br.readLine();
		  
		  System.out.print("나이 입력 	=");
		  String age = br.readLine();
		  
		  System.out.print("주소 입력 	=");
		  String address = br.readLine();
		  
		  System.out.print("연락처 입력	=");
		  String tel = br.readLine();
		  
		  System.out.println("나의 이름은 "+name+"이고");
		  System.out.println("나의 나이는 "+age+"이며");
		  System.out.println("나의 주소는 "+address);
		  System.out.println("나의 연락처 "+tel+"입니다.");
	}

}