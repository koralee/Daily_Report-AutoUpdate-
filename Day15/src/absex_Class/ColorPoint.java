package absex_Class;

public class ColorPoint extends Point {

	private String Color;

	public ColorPoint() {
		this(0, 0);
	}

	public ColorPoint(int x, int y, String Color) {
		super(x, y);
		this.Color = Color;
	}

	public ColorPoint(int x, int y) {
		super(x, y);
		this.Color = "Black";
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	@Override
	public String toString() {
		return Color + "색의(" + getX() + ", " + getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLO"); // 마일을 1.6으로 가정.
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + ":입니다");
	}
}
