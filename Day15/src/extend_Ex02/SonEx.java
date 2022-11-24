package extend_Ex02;

public class SonEx extends ParentEx{

		int foo = 7;
		public int getNumber(int a) {
			return a+2;
		}
		public static void main(String[] args) {
			ParentEx pe = new SonEx();
			int k = pe.getNumber(2);
			System.out.println(k); // 다형성에서 메소드는 자식꺼가 사용됨.
			System.out.println(pe.foo); // 다형성에서 멤버필드는 부모꺼가 사용됨.
		}
	}


