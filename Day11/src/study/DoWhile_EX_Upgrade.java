package study;

public class DoWhile_EX_Upgrade {
	public static void main(String[] args) {

		int i = -50;

		do {
			System.out.print(i + "\t");
			i++;
			if (i % 5 == 0)
				System.out.println(" ");
		}while (i <= 1);
	}
}