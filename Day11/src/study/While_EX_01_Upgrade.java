package study;

/*  문]  
 *  -50에서 1까지의 수를 출력하는 프로그램 작성
 *  단, 한줄에 5개의 수만 출력하고, 수들 사이를 탭 간격으로 출력
 */

import java.util.*;

public class While_EX_01_Upgrade {

	public static void main(String[] args) {
		int i = -50;
		
		while(i<=1) {
			System.out.print(i+"\t");
			i++;
			if(i%5==0)
				System.out.println(" ");
		}
		
		
	}
}