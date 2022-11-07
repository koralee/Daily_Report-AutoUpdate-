package study;

/*
 * 		shift 연산자
 *	  오른쪽 쉬프트  : 절반이 날아감    (/2와 동일)
 * 		왼쪽 쉬프트  : 절반이 증가      (*2와 동일)
 * 
 */
public class BitOperatorEx04 {

	public static void main(String[] args) {
		int x = 128;
		System.out.println(x << 3); // 128 * 2의3승     (2의3승은 8) 즉, 128 * 8 을 의미 == 1204;
		System.out.println(x >> 3); //  128 / 2의3승     (2의3승은 8) 즉, 128 / 8 의 의미 == 16;
	}

}
