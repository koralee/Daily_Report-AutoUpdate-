package extend_Ex03;

/*
 *		문]
 *
 * 		필드 : int  타입의 x,y, width, height  필드로 구성// 좌표과 크기를 의미
 * 		x,y, width, height 를 매개변수로 받아 필드를 초기화하는 생성자구성
 * 
 * 		사각형의 넓이를 구하는 메소드 int square()
 * 		사각형의 좌표와 넓이를 출력하는 프로그램 작성 void show()
 * 		매개변수로 받은 r 이 현 사각형안에 있으면 true를 return하는 메소드 boolean contains(Rectangle r)
 * 		
 * 		Rectangle r = new Rectangle(2,2,8,7)
 * 		Rectangle s = new Rectangle(5,5,6,6)
 * 		Rectangle t = new Rectangle(1,1,10,10)
 */
class Rectangle {

	private int x, y, w, h;

	Rectangle(int x, int y, int w, int h) {
		this.h = h;
		this.w = w;
		this.x = x;
		this.y = y;
	}

	public int square() {
		return w * h;
	}

	void show() {
		System.out.print("(" + x + ", " + y + " )에서 ");
		System.out.println("크기가 " + w + "X" + h + "인 사각형");
	}

	public boolean contain(Rectangle A) { 
		// Rectangle A는 새로운 객체가 아닌!!! 매개변수(=파마메터!)이다! 착각하지 말 것!
		if (x < A.x && y < A.y 
				&& x + w > A.x +A.w 
				&& y + h > A.y + A.h)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);  //기준
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contain(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contain(s))
			System.out.println("t는 s을 포함합니다.");
	}
}
