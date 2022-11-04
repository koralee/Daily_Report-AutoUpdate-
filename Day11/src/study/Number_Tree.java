package study;

public class Number_Tree {

	public static void main(String[] args) {
		int num = 4; // 원하는 반복 값 입력
		int i, j;
		for (i = 1; i <= num; i++) { // 가장 바깥쪽 for문은 반복 횟수 설정

			for (j = num; j > 1; j--) { // 왼쪽 숫자 출력 or 공백 출력 for문
				if (i >= j)
					System.out.print(j);    // 즉 num에서 부터 1씩 빼다가 i와 크거나 같으면 출력 
				else
					System.out.print("  "); // 그게 아니면 공백을 출력!
			}
			
			for (j = 1; j <= num; j++) { // 오른쪽 숫자 출력
				if (i >= j) 
					System.out.print(j);	// num이랑 비교해서 1씩 더하면서 크기가 값으면 출력
			}
			System.out.println();		// 줄 바꿈
		}
	}
}
