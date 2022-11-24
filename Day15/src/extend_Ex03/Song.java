package extend_Ex03;

/*	문]
 * 		필드 구성
 * 		제목 : Title, 가수: Artist, 노래발표년도 :Year, 국적: Country
 * 
 * 		생성자 2개로 구성 : 기본생성자, 모든 필드를 초기화하는 생성자   
 * 		노래의 정보를 출력하는 메소드 : show();
 * 
 * 		객체를 생성하여 노래 정보를 출력하는 프로그램을 작성하시오.
 * 
 * 		출력형식
 * 		1978년 스웨덴국적의 ABBA가 부른 딴씽퀸!
 * 
 */
import java.util.*;

public class Song {

	private String Title;
	private String Artist;
	private String Year;
	private String Country;

	public Song() {

	}

	public Song(String Title,String Artist,String Year,String Country){
		this.Title=Title;
		this.Artist=Artist;
		this.Year=Year;
		this.Country=Country;
	}
	
	public void show() {
		//1978년 스웨덴국적의 ABBA가 부른 딴씽퀸!
		System.out.println(Year+"년 "+Country+"국적의 "+Artist+"가 부른 "+Title);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Artist 입력 : ");
		String Artist = sc.nextLine();
		
		System.out.print("Artist의 국적 입력 : ");
		String Country = sc.nextLine();
		
		System.out.print("Title 입력 : ");
		String Tilte = sc.nextLine();
		
		System.out.print("Title 발매년도 입력 : ");
		String year = sc.nextLine();
		
		Song song = new Song(Tilte, Artist, year, Country);
		System.out.println();
		song.show();
	}
}
