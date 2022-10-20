package study;

public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';   // 문자
		char ch2 ='\u0041';  //  A의 유니코드       
		System.out.println("ch1 + ch2 = "+ch1+ch2);  // AA
		System.out.println("ch1 + ch2 = "+(ch1+ch2));// 130   아스키코드A의 숫가 값은 65이므로 
		System.out.println("ch1 + ch2 = "+(char)(ch1+ch2));   // 空(Null)의 개념
	}

}
