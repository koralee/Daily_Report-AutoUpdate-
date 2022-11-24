package extend_Ex02;

public class SuperEx_main {

	public static void main(String[] args) {
		SuperEx02 se = new SuperEx02();
		SuperEx01 se2 = new SuperEx01();
		
		//se.write(); // 자식메소드 필드값은 (자식꺼)
		//se.print(); // 자식메소드 필드값은 (부모꺼)

		// 부모의 멤버 필드에 접근
		System.out.println(se.b); // 자식 필드 접근

		System.out.println(((SuperEx01) se).b); // 부모꺼를 오버라이딩해서 부모필드 접근

		((SuperEx01) se).write(); // 부모꺼를 오버라이딩해서 자식 메소드에 접근
	
		se2.write();
	}
}