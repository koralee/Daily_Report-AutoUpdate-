package classEx02_VVVImportant;

public class LG_Television {
	public static void main(String[] args) {
		
		// 객체 선언 및 객체 생성
		Tv LGtv = new Tv(); // Tv 인스턴스를 생성함.(instance = 구체적으로 실체화된 객체)
	
		LGtv.channel = 24;  // 객체를 통해 필드를 설정함.
		System.out.println("현재 LGtv의 처음 채널은 " + LGtv.channel);
		LGtv.channelDown(); // 채널을 변경 ↓  현재 채널 23으로 변경됨.
		System.out.println("현재 LGtv의 변경 채널은 " + LGtv.channel);
	}
}
