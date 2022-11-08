package study;

/*  
 * 		문2]
 *	    사용자로 부터 임의의 년도를 입력받아 윤년인지 평년인지를 판별하는 
 *	    프로그램을 삼항 연산자를 이용하여 작성하시오.
 *	     
 *	     윤년 >>> 년을 4로 나누어서 떨어진다. 
 *	                   년 400으로 나누어 떨어진다.
 *	                  년을 100으로 나누어 떨어지지 않으면됨 
 */
import java.io.*;

public class Years_Seperation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 년도를 입력 : ");
		
		int year = Integer.parseInt(br.readLine());
			System.out.println(year);
			
			String S = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))?"윤년":"평년";
			System.out.println(year+"년도는 "+S+"입니다.");
	}
}
