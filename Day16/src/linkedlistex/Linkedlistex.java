package linkedlistex;

import java.util.*;

public class Linkedlistex<E> {

	private static final String color1[] = { "깜장", "노랭", "초랑", "퍼렁", "쫭이", "욘두" };
	private static final String color2[] = { "초록", "빨강", "흰색", "남색", "보라" };

	public Linkedlistex() {
		LinkedList<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();

		for (String color : color1)
			list1.add(color);

		for (String color : color2)
			list1.add(color);

		list1.addAll(list2);
		printList(list1);
	}

	public void printList(List<String> list) {
		System.out.println("\n list...........");
		for (String color : list) {
			System.out.printf("%s  ", color);
		}
	}

	public static void main(String[] args) {
		new Linkedlistex();
	}
}
