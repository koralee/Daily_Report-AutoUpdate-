package absex_Class;
/*
 *  converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하시오
 * 
 * 	main()
 * 
 * 	public static void main(String[] args){
 * Won2Dollar toDollar = new Won2Dollar(1200);  // 달라를 1200으로 가정.
 * toDollar.run();
 * 
 * }
 * 
 * 		출력
 * 		원을 달러로 바꿉니다.
 * 		원을 입력하세요 : 24000
 * 		변환 결과 : 20.0$ 입니다.
 */


import java.util.*;
public abstract class Converter { // 변환

	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDsetString();
	protected double ratio;// 비율
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+" 을 "+getDsetString()+ " 로 바꿉니다.");
		System.out.println(getSrcString()+" 을 입력하세요 ");
		System.out.print("입력 : ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : "+res+" "+getDsetString()+" 입니다.");			
	}
	
}
