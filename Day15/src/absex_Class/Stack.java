package absex_Class;

public interface Stack {

	int length(); 		// 현재 Stack에 저장된 개수를 리턴
	int capacity();	// 현재 Stack 전체에 저장 가능 용량을 리턴
	String pop();		// Stack의 톱에 (top)실제수 저장
	boolean push(String val); // 스택의 톱에 저장된 실제 수 리턴
}
