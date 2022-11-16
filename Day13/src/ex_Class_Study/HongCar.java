package ex_Class_Study;

public class HongCar {
	public static void main(String[] args) {
		// Car 클래스에 접근하기 위해서는 객체 또는 인스턴스를 생성한다.
		
		Car HongCar = new Car(); // 클래스를 이용해서 객체를 생성
		
		//HongCar.color = "Red";		//차량 속성 설정
		//HongCar.speed=0;// 초기 속도
		HongCar.getColor();  //Car의 color를 갖고 오는 기능
		HongCar.getSpeed(); //Car의 speed를 갖고 오는 기능
		
		System.out.println(HongCar.getSpeed());  //0
		HongCar.setSpeed(0); //기본 차량 속도
		HongCar.speedUp(60);	 // +60
		//HongCar.speedDown(30);
		HongCar.prt(); 

		Car HongECar = new Car();  // 다른 객체 또 하나 생성
		HongECar.prt();    // 다른 객체 이지만 같은 Car 클래스로 만들어졌기때문에 prt()기능 사용가능!
	}
}
