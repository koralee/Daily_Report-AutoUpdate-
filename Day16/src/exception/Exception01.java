package exception;

public class Exception01 {
	public static void main(String[] args) {
		int num = 50;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
			result = num / (int) (Math.random()*5);
			System.out.println(result);
			}catch(ArithmeticException ae) { 					// 만약 에러가 발생하면!
				//System.out.println("Exception 발생 ...."); 	// 사용자가 설정한 메세지를 사용하겠다는 뜻
				System.out.println(ae.getMessage());										// API에 있는 메세지 사용하겠다는 뜻
			}
		}
	}
}
