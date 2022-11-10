package array_01_Basic;

public class Array_EX04 {

	public static void main(String[] args) {

		char[] ch = new char[4];
		//배열의 값 저장
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		System.out.println(ch.length);
		
		
		for(int i = 0; i<ch.length; i++) {
			System.out.println("ch["+i+"] +"+ch[i]);
		}
		
		
		/*
		for(char cc : ch) {   // 향상된 for문
			//System.out.println("cc = "+ cc);
			System.out.print(cc);
		}
		*/
	}

}
