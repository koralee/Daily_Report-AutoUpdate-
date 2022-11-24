package extend_Ex03;

/*
 * 		문]
 *		//생성자로 초기화, 메소드를 이용하여 출력하는 프로그램을 작성
 * 		LG,2017,65인치
 * 		
 * 		//출력
 * 		LG에서 만든 2017년형 65인치 TV
 * 
 */

public class TV {
	
	private String Brand;
	private String year;
	private int size;
	
	public TV(String Brand, String year,int size){
		this.Brand =Brand;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(Brand+"에서 만든 "+year+"년형 "+size+"인치 "+getClass().getSimpleName());
	}
	
	
	public static void main(String[] args) {
		TV tv = new TV("LG", "2017",65);
		tv.show();
	}
}
