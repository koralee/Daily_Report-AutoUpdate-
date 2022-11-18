package classEx02_VVVImportant;

public class JavaPizza {

	public static void main(String[] args) {
		
		Circle Pizza = new Circle();
		
		Pizza.r = 7;
		Pizza.name="Java";
		
		double PizzaSize = Pizza.getArea();
		System.out.println("크기가"+PizzaSize+" 인  "+Pizza.name+" 가 나왔습니다.");
		System.out.println("맛있게 드세요");
	}

}
