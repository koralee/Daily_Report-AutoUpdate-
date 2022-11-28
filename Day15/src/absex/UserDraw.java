package absex;

public class UserDraw {

	public static void main(String[] args) {
		Diagram[] di = new Diagram[2];
		// Diagram id = new Diagram();   // Diagram이 추상 클래스이므로 객체를 만들 수 없다.  
		
		di[0] = new Triangle();
		di[1] = new Circle();
		
		for(int i = 0; i<di.length;i++)
			di[i].draw();
	}

}
