package classEx02_VVVImportant;

import java.io.*;

public class Method01 {

	public int aaa() throws IOException { // 두 수 사이의 최대값 구하는 기능
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫 번째의 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두 번째의 수 : ");
		int b = Integer.parseInt(br.readLine());
		if (a > b) {
			return a;
		}
		return b;
	}

	public void bbb() throws IOException { // 두 수 사이의 합계를 구하는 기능
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫 번째의 수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("두 번째의 수 : ");
		int b = Integer.parseInt(br.readLine());

		int sum = 0;
		if (a > b) {// Swap
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "에서" + b + "까지의 합계 : " + sum);
	}

	public String ccc(int x, int y, int z) throws IOException {
		// 3개의 정수를 입력받아 크기가 큰 순서대로 출력

		if (y >= x && y >= z) {
			x = x ^ y;
			y = y ^ x;
			x = x ^ y;
		} else if (z >= x && z > y) {
			x = x ^ z;
			z = z ^ x;
			x = x ^ z;		}
		if (z >= y) {
			y = y ^ z;
			z = z ^ y;
			y = y ^ z;
		}

		String abc = x + " >= " + y + " >= " + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		Method01 me = new Method01();
		while (true) {
			System.out.println("1. 최대값 구하기, 2. 사이의 값 합계, 3. 가장 큰 순서대로 4. 종료");
			x = Integer.parseInt(br.readLine());
			if (x == 1) {
				int k = me.aaa();
				System.out.println("두 수 중에 가장 큰 수는 " + k + "입니다.");
			} else if (x == 2)
				me.bbb();
			else if (x == 3) {
				System.out.println("첫 번째의 수 : ");
				int a = Integer.parseInt(br.readLine());
				System.out.println("두 번째의 수 : ");
				int b = Integer.parseInt(br.readLine());
				System.out.println("세 번째의 수 : ");
				int c = Integer.parseInt(br.readLine());
				System.out.println(me.ccc(a, b, c));
			} else if (x == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(" 잘못 입력하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("수고하셨습니다.");
	}
}
