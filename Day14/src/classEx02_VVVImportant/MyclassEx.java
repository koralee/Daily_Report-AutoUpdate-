package classEx02_VVVImportant;

public class MyclassEx {

	public static void main(String[] args) {
		Myclass mc1 = new Myclass();
		Myclass mc2 = new Myclass("유명");
		Myclass mc3 = new Myclass("졸라유명",23);
		Myclass mc4 = new Myclass(25, "졸라유명");

		System.out.println(mc1.getName() + ", " + mc1.getAge());
		System.out.println(mc2.getName() + ", " + mc2.getAge());
		System.out.println(mc3.getName() + ", " + mc3.getAge());
		System.out.print(mc4.getName() + ", " + mc4.getAge());
	}
}
