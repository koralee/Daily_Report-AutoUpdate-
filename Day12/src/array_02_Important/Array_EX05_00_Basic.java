package array_02_Important;

/*
 *  char 자료형의 배열에 알파벳 대문자를 채우고
 *  채워진 배열의 전체 요소를 출력하는 프로그램 작성
 *  단, 반복문을 이용하여 배열을 초기화 하시오
 *
 */

public class Array_EX05_00_Basic {
	public static void main(String[] args) {
		char[] arr = new char[26];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		arr[5] = 'F';
		arr[6] = 'G';
		arr[7] = 'H';
		arr[8] = 'I';
		arr[9] = 'J';
		arr[10] = 'K';
		arr[11] = 'L';
		arr[12] = 'M';
		arr[13] = 'N';
		arr[14] = 'O';
		arr[15] = 'P';
		arr[16] = 'Q';
		arr[17] = 'R';
		arr[18] = 'S';
		arr[19] = 'T';
		arr[20] = 'U';
		arr[21] = 'V';
		arr[22] = 'W';
		arr[23] = 'X';
		arr[24] = 'Y';
		arr[25] = 'Z';
		
		for(int i = 0; i<arr.length;i++)
			System.out.print(arr[i]);
	}
}
