package enumex;

public class EnumEX03 {
	public static void main(String[] args) {
		System.out.println("서울의 인구 : "+City.SEOUL.getIngu());
		
		for(City c : City.values())
			System.out.printf("%s(%s) : %d%n",c,c.getCityName(),c.getIngu());
	}
}
