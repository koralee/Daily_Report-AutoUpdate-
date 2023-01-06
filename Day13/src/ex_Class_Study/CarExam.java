package ex_Class_Study;

public class CarExam {

	public static void main(String[] args) {
		Car.speed = 10; // static 변수이므로 직접 접근 가능
		//Car.color="Pink";// Static 변수가 아니므로 직접 접근 불가능
		
		Car car1 = new Car();
		Car car2 = new Car("노랑");
		car1.color = "Green";
		car1.speed=370;
		
	}

}
