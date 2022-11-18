package classEx03_Array;

public class Tv { // 클래스 >>> 하나의 객체이면서 설계도
	//설명
	int aa;// (인스턴스 변수) 사용하기 위해서는 객체를 생성해서 생성된 객체를 통해 사용.
	static int bb;// 클래스변수(공유 변수) 객채 생성 필요없이 바로 땡겨서 사용 가능.
	
	// 멤버 필드(변수 or 속성)
	// 색상
	String color;
	// 전원의 상태
	boolean power;
	// 채널
	int channel;

	// 메소드 (기능, 행위, 동작, 함수 같은 것들 )
	public void power() { // on off 기능의 메소드
		power = !power;
	}

	public void channelUp() { // 채널 올리는 기능
		++channel;
	}

	public void channelDown() {// 채널 내리는 기능
		--channel;
	}

}
