package exam;

/*문제 .4) 임의의 두 정수를 입력받아 합을 구하는 프로그램을 작성하시오.*/
import java.io.*;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 객체를 사용 ==즉,  문자열은 입력받아 버퍼에 저장하였다가 출력에 사용을 의미.

		
		int A, B, C; // 정수형 변수 형성
		System.out.println("첫 번째 정수 입력: ");
		A = Integer.parseInt(br.readLine());  // readLine() 자체는 String 즉 문자열의 자료형인데 A는 정수형의 변수로 형성되었으므로
		 													// 문자열인 자료형을 인트형으로 파스해줘주는 것.
		
		System.out.println("두 번째 정수 입력: ");
		B = Integer.parseInt(br.readLine());	// readLine() 자체는 String 즉 문자열의 자료형인데 B는 정수형의 변수로 형성되었으므로
															// 문자열인 자료형을 인트형으로 파스해줘주는 것.
		
		C = A + B;  // 그럼 A도 B도 결국은 문자형으로 받아들여졌지만 Integer.parseInt로 인하여 정수형으로 형을 변환시켰으므로
						 // 정수형 변수인 C에 값을 저장이 가능  그래서 A값과 B값을 더해서 C에 더한 값을 저장할 수 있음을 의미. 
		
		System.out.println("두 정수의 합 :" + C);  // 두 수의 합을 저장한 C를 출력
		
		
	}

}
