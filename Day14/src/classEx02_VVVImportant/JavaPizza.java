package classEx02_VVVImportant;

public class JavaPizza {

	public static void main(String[] args) {
		
		Circle Pizza = new Circle();
		Circle donut = new Circle(5,"던킨");
		Pizza.r = 7;
		Pizza.name="Java";
		double PizzaSize = Pizza.getArea();
		System.out.println("크기가"+PizzaSize+" 인  "+Pizza.name+" 피자가 나왔습니다.");
		System.out.println("맛있게 드세요");
		double DonutSize = donut.getArea();
		System.out.println("크기가"+DonutSize+" 인  "+donut.name+" 도넛이 나왔습니다.");
		System.out.println("맛있게 드세요");
	}

}
