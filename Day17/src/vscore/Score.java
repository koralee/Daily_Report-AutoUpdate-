package vscore;

public interface Score { // 인터페이스는 추상!

	// 추가
	public void insert();
	
	// 변경(수정)
	public void update();
	
	// 삭제
	public void delete();
	
	// 전체목록
	public void listAll();
	
	// 학번으로 검색
	public void searchHak();
	
	// 이름으로 검색
	public void searchName();
	
}
