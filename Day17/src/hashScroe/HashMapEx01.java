package hashScroe;

import java.util.*;

public class HashMapEx01 {
	public static void main(String[] args) {
		//Map<키, 값> : 키는 중복을 허용하지 않는다.
		//키가 중복인 경우 값이 변경
		
		Map<String, String> map = new HashMap<>();
		map.put("만화","마녀 애새끼 키키");
		map.put("호러", "아이!스크림");
		map.put("영화","요람에서 무덤까지");
		
		System.out.println(map);
		System.out.println(map);
		
		String key ;
		Set set = map.keySet();
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.print(" "+key);  // 키 만 출력
			System.out.print(" "+map.get(key));// 키를 이용하여 값을 출력
		}
		map.put("영화", "달마야 놀자");
		System.out.println("\n"+ map);
	}
}
