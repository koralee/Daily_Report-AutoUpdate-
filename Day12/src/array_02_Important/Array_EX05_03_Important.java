package array_02_Important;

public class Array_EX05_03_Important {
	public static void main(String[] args) {
		char[] arr4 = new char[26];

		for (int i = 0; i < arr4.length; i++)
			arr4[i] = (char)('A'+i);

		for (int i = 0; i < arr4.length; i++)
			System.out.print(arr4[i]);

	}
}
