package classEx02_VVVImportant;

public class RectEx {

	public static void main(String[] args) {
		
		Rect  r = new Rect(); // 객체선언 + 생성
		r.input(); // 객체를 통해서 메소드 호출
		System.out.println("가로 길이 : "+r.w +" 세로 길이 : "+r.h);
		int area = r.area();
		double girth = r.girth();
		//System.out.println("사각형의 넓이 : "+area);
		//System.out.println("사각형의 둘레 : "+girth);
		System.out.println("\n\n");
	
		//출력 메소드 호출
		r.output(area, girth);
		
	}

}
