package hashScroe;

import java.util.*;

public class HashMapEx03 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("가길동",new Integer(100));
		map.put("나길동",new Integer(90));
		map.put("가길동",new Integer(80));  //일부러 중복 Test
		
		map.put("라길동",new Integer(70));
		map.put("마길동",new Integer(80));
		map.put("바길동",new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+"점수 : "+e.getValue());
		}

		set = map.keySet();
		System.out.println("\n이름 :"+ set+"\n");
		
		Collection values = map.values();
		it = values.iterator();
		
		int sum = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			System.out.println("\n점수 : "+ i);
			sum+=i.intValue();
			System.out.println("점수의 총합 : "+sum);
			System.out.println("평균 : "+(float)sum/set.size());
			System.out.println("최고점수 :"+Collections.max(values));
			System.out.println("최고점수 :"+Collections.min(values));
		}
	}
}
