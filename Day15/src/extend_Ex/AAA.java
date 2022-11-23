package extend_Ex;

public class AAA {
	protected int x, y;
	protected char ch;
	
	public AAA() {}// 기본 생성자
	
	public void write(double result) { //출력 메소드
		System.out.printf("%d %c %d = %.2f\n",x,ch,y,result);
	}
}
