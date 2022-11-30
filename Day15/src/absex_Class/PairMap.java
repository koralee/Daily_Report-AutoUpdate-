package absex_Class;

public abstract class PairMap {

	// key 들을 저장하는 배열
	protected String keyArray[];	
	// value 들을 저장하는 배열
	protected String valueArray[];
	
	// ket값을 가진 value 리턴, 없으면 null 리턴
	abstract String get(String key);
	// key와 값을 쌍으로 저장하는 메소드, key값이 존재하면 값을 수정함.
	abstract void put(String key, String value);
	// key값을 가진 항목삭제, 삭제된 값을 리턴함.
	abstract String delete(String key);
	
	// 현재 저장된 항목을 개수 리턴
	abstract int length();
	
}
