package array_02_Important;

public class Array_EX05_02_Important {
	public static void main(String[] args) {
		char[] arr3 = new char[26];
		
		for(int i = 0, b=65;i<arr3.length;i++,b++)
			arr3[i]=(char)b;
		
		for(int i=0; i<arr3.length;i++) 
			System.out.print(arr3[i]);
		
	}
}
