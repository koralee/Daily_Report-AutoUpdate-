package setEx;

import java.util.*;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + age;
	}

}

public class HashSetEX02 {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>(); 
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));  // new라는 것은 하나의 객체를 만드는 것이므로 독립된 객체를 의미하므로 중복이 아니다!
		
		System.out.println(set);
	}
}
