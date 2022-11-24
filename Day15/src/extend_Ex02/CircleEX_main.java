package extend_Ex02;

public class CircleEX_main extends PointEx{
	
	private int r;
	public CircleEX_main() {}
	public CircleEX_main(int x) {
		super(x); // 부모의 생성자
		r=1;
	}
	public CircleEX_main(int x, int y) {
		super(x,y); // 부모의 생성자
		r=2;
	}
	public CircleEX_main(int x, int y,int r) {
		super(x,y); // 부모의 생성자
		this.r=r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		super.disp();
		System.out.println("r의 값 : "+r);
	}
	
	public static void main(String[] args) {
		PointEx ex1 = new PointEx();
		CircleEX_main ex2_1 = new CircleEX_main(1);
		CircleEX_main ex2_2 = new CircleEX_main(1,2);
		CircleEX_main ex2_3 = new CircleEX_main(1,2,3);
		
		ex1.disp();
		System.out.println();
		ex2_1.disp();
		System.out.println();
		ex2_2.disp();
		System.out.println();
		ex2_3.disp();
		
	}

}
