package enumex;

public enum City {

	SEOUL("서울", 1000), 	//0
	BUSAN("부산", 350),	//1
	DAEGU("대구", 250),	//2
	INCHON("인천", 200);	//3

	private final String cityName;
	private final int Ingu;

	protected String getCityName() {
		return cityName;
	}

	protected int getIngu() {
		return Ingu;
	}

	private City(String cityName, int Ingu) {
		this.cityName = cityName;
		this.Ingu = Ingu;

	}
}
