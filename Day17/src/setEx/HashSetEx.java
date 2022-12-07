package setEx;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("삽살개");
		
		System.out.println(dog);
		
		dog.add("진돗개");
		
		System.out.println(dog);  // Set은 중복 허용X
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {// Data가 존재한다면
			String s = it.next();
			System.out.print(" "+s);
		}
	}
}
