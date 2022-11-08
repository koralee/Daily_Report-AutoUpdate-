package study;
/* 문]	
 * 		
 * 5개의 정수를 입력 받고 그 중 양수들만의 합계를 출력하는 프로그램 작성
 * 단, 0이나 음수가 입력되면 continue 문을 이용하여 넘어간다.
 * 
 */
import java.util.*;
public class EX03_Upgrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("5개의 정수를 입력");
		for(int i=0;i<5;i++){
			System.out.print("정수 입력 :  ");
			int n = sc.nextInt();
			
			if(n<0) {
				continue;  // 무시하고 밖으로 빠져나감
			}else
				sum+=n;
		}
		System.out.println("합계 : "+ sum);
		
	}

}
