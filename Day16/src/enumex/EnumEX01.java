package enumex;

public class EnumEX01 {
	private Color myColor = Color.Red;

	protected Color getMyColor() {
		return myColor;
	}

	protected void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {

		EnumEX01 ee = new EnumEX01();
		System.out.println("처음 셋팅된 Color : " + ee.getMyColor());
		ee.setMyColor(Color.Green);
		System.out.println("변경한 Color : " + ee.getMyColor());
		Color color = ee.getMyColor();

		switch (color) {
		case Red:
			System.out.println("Red");
			break;
		case Green:
			System.out.println("Green");
			break;
		case Blue:
			System.out.println("Blue");
			break;
		case SkyBlue:
			System.out.println("SkyBlue");
			break;
		}
	}
}
