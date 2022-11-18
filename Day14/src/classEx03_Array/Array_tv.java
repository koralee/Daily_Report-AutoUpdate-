package classEx03_Array;

public class Array_tv { // 클래스 >>> 하나의 객체이면서 설계도

	public static void main(String[] args) {

		
		Tv[] tv = new Tv[3]; // 객체 배열 선언 ex) 3개
		//tv. (필드) or (메소드) 는 아직 선언만 하였고 생성은 X 라서 아직 사용 불가
		
		// 객체 배열 생성
		/*
		 * 방법 1) tv[0] = new Tv(); tv[1] = new Tv(); tv[2] = new Tv();
		 */

		// 방법 2)
		// Tv[] tv2 = {new Tv(),new Tv(),new Tv()}; //  Tv[0], Tv[1], Tv[1]

		// 방법 3)
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			tv[i].channel=24;
			tv[i].channelUp();
		}
		
		//출력
		for (int i = 0; i < tv.length; i++) {
			tv[i].channelUp(); //각각 1씩만 증가
			tv[i].channelDown(); //각각 1씩만 감소
			System.out.println(tv[i].channel+"\n"); // 각각 1씩만 증가 된 값이 출력된다.
		}
	}
}
