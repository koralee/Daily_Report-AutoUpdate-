package classEx02_VVVImportant;

public class Tv { // 클래스 >>> 하나의 객체이면서 설계도
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
