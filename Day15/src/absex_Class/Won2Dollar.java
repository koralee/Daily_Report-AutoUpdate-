package absex_Class;

public class Won2Dollar extends Converter{
  
	public Won2Dollar(double ratio) {
	this.ratio = ratio;
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);  // 달라를 1200으로 가정.
		 toDollar.run();
	}
	
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDsetString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	


}
