package collec;

import java.util.*;

public class VectorEx01 {
	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두" };

	public static void main(String[] args) {
		int i;
		String str;

		Vector<String> vs = new Vector<>();

		for (i = 0; i < colors.length; i++) {
			vs.add(colors[i]);
		}

		// 전체 출력
		Iterator<String> it = vs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println("\n");
		for (Object o : vs) {
			String ss = (String) o;
			System.out.print(ss+" ");
		}
	}
}
