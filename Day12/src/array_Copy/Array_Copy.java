package array_Copy;
/*
 *  배열 복사
 *  
 *  1. 한 번 만들엊ㄴ 배열의 크기는 변경할 수 없다.
 *  2. 크기를 늘리려면 같은 자료형의 배열을 원하는 크기로 준비하고
 *      기존의 배열을 복사하면 작업을 완료할 수 있다.
 *  3. 배열을 복사하려면 System.arraycopy() 메소드(=함수)fmf dldydgka.
 *  
 *  	arraycopy()의 형식
 *  
 *  	public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length ){ }
 *  
 *  	Object src		: 기존배열(원본배열)
 *  	int srcPos		: 기존배열의 복사 시작 위치(인텍스, 첨자)를 의미함. Ex [0]
 *  	Object dest		: 복사될 배열
 *  	int destPos		: 복사 시작 위치
 *  	int length		: 복사되는 배열의 길이(요소의 수)
 */

public class Array_Copy {
	public static void main(String[] args) {
		String[] src = {"Java","Database","JSP","XML"};  // 현재 4개 이지만 OS, Network  2개를 더 추가 하고 싶다고 가정!
		String[] des = new String[6];
		
		des[0]="OS";
		des[1]="Network";
		System.arraycopy(src,0,des,2,4);
		for(String temp : des)
			System.out.print(temp+", ");
		
	}
}
