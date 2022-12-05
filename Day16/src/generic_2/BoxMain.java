package generic_2;

public class BoxMain {
	public static void main(String[] args) {
		Box<Integer> bi = new Box<>();
		bi.set(new Integer(10));
		Integer i = bi.get();
		System.out.println(i);
		System.out.println(i instanceof Integer);
	}
}
