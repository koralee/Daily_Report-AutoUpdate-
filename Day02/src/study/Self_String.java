package study;

import java.io.*;

public class Self_String {

	public static void main(String[] args) throws IOException {
		// 문자열 입력 받아 확인해보기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름을 입력하세요 : ");
		String name = br.readLine();
		System.out.println("나이을 입력하세요 : ");
		String age = br.readLine();
		System.out.println("주소를 입력하세요 : ");
		String address = br.readLine();
		System.out.println("연락처를 입력하세요 : ");
		String tel = br.readLine();
		
		System.out.println("이름은	 :"+name+"이고");
		System.out.println("나이는	 :"+age+"이며");
		System.out.println("주소는 	 :"+address);
		System.out.println("연락처는 :"+tel+"입니다.");
		
		
		

	}

}
