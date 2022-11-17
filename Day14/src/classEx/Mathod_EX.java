package classEx;

class MethodEx {

	public int sum(int i, int j) { // 더하기 메소드
		int res = i + j;
		return res;
	}
	
	public int sub(int i, int j) { // 빼기 메소드
		int res = i - j;
		return res;
	}

	public int cob(int i, int j) { // 곱하기 메소드
		int res = i * j;
		return res;
	}
	public int dic(int i, int j) { // 나누기 메소드
		int res = i / j;
		return res;
	}

}

public class Mathod_EX {
	public static void main(String[] args) {
		MethodEx cal = new MethodEx();  
		//위 클래스 내부의 메소드를 사용하기 위해서 관련 클래스의 새로운 객체 생성
		
		int i = 10, j=10;
		int a = cal.sum(i, j);
		int b = cal.sub(i, j);
		int c = cal.cob(i, j);
		int d = cal.dic(20, 10);// 값을 직접 넣어줘도 됨!
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}
}