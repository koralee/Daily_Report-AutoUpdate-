package ex_Class_Study;

public class Car { // 클래스 정의

	// 속성, 필드(=변수) 선언
	private String color; // 속성 선언
	private int speed; // 속도

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void speedUp(int value) {
		speed += value;
		System.out.println("현재 당신의 속도는 "+speed+" Km 입니다.");
	}
	
	void speedDown(int value) {
		speed-=	value;
		System.out.println("현재 당신의 속도는 " + speed+" Km 입니다.");
	}
	

	void prt() {
		System.out.println(getSpeed());
		System.out.println(getSpeed());
	}
}
