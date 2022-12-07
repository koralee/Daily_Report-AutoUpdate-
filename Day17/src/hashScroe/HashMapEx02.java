package hashScroe;

import java.util.*;

public class HashMapEx02 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("한국어", "안녕");
		map.put("일본어", "곤방와");
		map.put("영	  어", "헬로");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ID와 PW를 입력 : ");
			String id = sc.next();
			String pw = sc.next();
			System.out.println();
			
			if(!map.containsKey(id)) { // ID가 존재하지 않으면
				System.out.println("입력하신 ID는 없는 아이디 입니다.");
				continue;
			}else {// ID가 존재하면
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치 하지 않음 다시 입력 바람...");
				}else {
					System.out.println("ID와 비밀번호가 일치합니다."); //Login
					break;
				}
			}
		}
		
		
	}
}
