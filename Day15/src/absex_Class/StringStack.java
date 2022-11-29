package absex_Class;


public class StringStack implements Stack {

	//Stack에 저장할 공간 확보
	private String[] element;
	private int tos;// index = top of stack  즉, 인택스의 위치
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1; // 인덱스 -1을 의미 즉, 비어있음.
	}

	@Override
	public int length() {
		return tos + 1; // 현재 스택에 저장된 개수 리턴
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return element.length;
	}

	@Override
	public String pop() {
		//Stack이 비어있음.
		if(tos == -1)
			return null;
		String s = element[tos];
		tos--; // Stack 포인터 감소 
		return s;
	}

	@Override
	public boolean push(String val) {
		//Stack이 다 찾을 경우 false를 리턴
		if(tos == element.length-1)
		return false;
		else {
			tos++; // Stack 포인터 증가 
			element[tos] = val;// 인덱스에 값을 저장후 스택 포인터 증가
			return true;
		}
	}

}
