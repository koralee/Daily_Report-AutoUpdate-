package ex_Class_Study;

public class Car { // 클래스 정의

	// 속성, 필드(=변수) 선언
	protected String color; // 속성 선언
	public static int speed; // 속도

	public Car() { // 생성자로 초기값 설정(public 생략가능)
		color = "빨강";
		speed = 0;
	}

	public Car(String color) { // 생성자로 초기값 설정(public 생략가능)
		color = color;
		speed = 0;
	}

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
		System.out.println("현재 당신의 속도는 " + speed + " Km 입니다.");
	}

	void speedDown(int value) {
		speed -= value;
		System.out.println("현재 당신의 속도는 " + speed + " Km 입니다.");
	}

	void prt() {
		System.out.println(getSpeed());
		System.out.println(getSpeed());
	}
}
