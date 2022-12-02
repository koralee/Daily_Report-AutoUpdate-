package innorex;

public class LocalInnerTest {

	static int a = 10; // 클래스변수(= 공유변수) [객체를 생성X 여도 접근 가능한 변수]
	int b = 20; // 인스턴스 변수( 객체를 생성해야만 접근이 가능한 변수)

	public void write() {
		int c = 30; // --------------------->>>>// 딱! 초기에 셋팅된 값만 갖고올 수 있고!
		// c=50; // 이렇게 하면 Error가 난다! // 변한값은 못가져온다!

		// 이유: 메소드 내부의 (Local)클래스의 변수는 Final로 선언된 것만 갖고 올 수 있다.
		// 그러므로 만약에 사용할 거면 처음부터 final로 상수화하려 사용해라! 아니면 local클래스에서 호출해서 사용을 하지 말던지!
		final int d = 40; // final => 상수화의 의미!

		class LocalNested { // 하나의 변수처럼 사용한다고 생각하는게 좋다!

			// static int e = 100;
			public void prt() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}

		}
		LocalNested ln = new LocalNested();
		ln.prt();
	}

	public static void main(String[] args) {
		LocalInnerTest lt = new LocalInnerTest();
		lt.write();
	}

}
