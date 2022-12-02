package enumex;

public class EnumEX02 {
	public static void main(String[] args) {
		double x = Double.parseDouble("10.2");
		double y = Double.parseDouble("20.0");
		System.out.println(Operation.PLUS.eval(x, y));

		for(Operation op : Operation.values()) {
			System.out.printf("%f   %s   %f = %f%n",x,op,y,op.eval(x, y));
		}
	}
}
