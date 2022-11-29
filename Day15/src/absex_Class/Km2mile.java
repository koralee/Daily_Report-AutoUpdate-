package absex_Class;

public class Km2mile extends Converter{

	public Km2mile(double ratio) {
		this.ratio=ratio;
	}
	public static void main(String[] args) {
		Km2mile toMile = new Km2mile(1.6);  // 마일을 1.6으로 가정.
		toMile.run();
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDsetString() {
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
