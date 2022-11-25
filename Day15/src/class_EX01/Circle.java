package class_EX01;

public class Circle {
	private double x, y;
	private int radius;
	
	Circle(double x, double y, int radius){// 필드 초기화
		this.x=x;
		this.y=y;
		this.radius =radius;
	}
	
	public void show() { // 출력 
		System.out.println("("+x+", "+y+")"+radius);
	}
	
	public double calc() {
		return radius*radius*Math.PI;
	}
}
