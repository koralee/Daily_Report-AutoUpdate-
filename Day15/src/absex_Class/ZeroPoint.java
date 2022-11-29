package absex_Class;

public class ZeroPoint extends Point {

	private String Color = "Black";
	int x;
	int y;

	public ZeroPoint(int x, int y) {
		super(x, y);
	}

	public static void main(String[] args) {
		ColorPoint ZeroPoint = new ColorPoint(); // 0, 0 Black

		System.out.println(ZeroPoint.toString() + ":입니다");

		ColorPoint ZeroPoint2 = new ColorPoint(0, 0);// 10.10의 위치 블랙
		ZeroPoint.setXY(5, 5);
		ZeroPoint.setColor("RED");

		System.out.println(ZeroPoint.toString() + ":입니다");
	}

}
