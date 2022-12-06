package collec;

import java.util.*;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class VectorEx02 {

	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두", "보라", "파랑", "흰색", "주황" };

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		System.out.println("벡터의 크기 : " + v.capacity());

		for (String str : colors)
			v.add(str);

		System.out.println("요소의 개수 : " + v.size());
		System.out.println("첫 번째 인덱스 값 : " + v.firstElement());
		System.out.println("두 번째 인덱스 값 : " + v.get(1));
		System.out.println("마지막 인텍스  값 : " + v.lastElement());

		String ss = v.get(1);
		// 두 번째 값을 핑크색상으로 변경
		v.set(1, "삥꾸");
		// 변경된 값 확인
		System.out.println(ss + " 에서 변경된 두 번째 인덱스의 값을 확인 : " + v.get(1));
		System.out.println("요소의 개수 : " + v.size());

		v.remove(1); // 두 번째 요소 값 삭제
		System.out.println("요소의 개수 : " + v.size());
		System.out.println("벡터의 크기 : " + v.capacity()); // 벡터의 저장공간은 2배씩 증가 !

		// 첫 번재 요소에 하늘색 추가
		v.insertElementAt("하늘색", 0);
		System.out.println("첫 번째 인덱스 값 : " + v.firstElement());
		System.out.println("요소의 개수 : " + v.size());

		// 오름차순 정렬 : ㄱ ㄴ ㄷ.....
		Collections.sort(v);
		System.out.println("오름차순 : " + v);
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		// 검색
		int idx = Collections.binarySearch(v, "검정");
		System.out.println("\n 파랑 : " + idx + "index에 위치");
		// 검색 자료가 벡터안에 없을 경우 음수를 출력한다.

		// 내림차순 정렬 : ㅎ ㅍ ㅌ....
		Collections.sort(v,Collections.reverseOrder());
		System.out.print("내림차순 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		//내림차순 검색
		idx = Collections.binarySearch(v, "녹색",Collections.reverseOrder());
		System.out.println("\n 파랑 : " + idx + "index에 위치");
		// 검색 자료가 벡터안에 없을 경우 음수를 출력한다.
		
		
		String s ="검정";
		if(v.contains(s)) {
			int i = v.indexOf(s)+1;
		System.out.println(s+ "--> 위치 : "+i);
		}
		
		
		
		// 전체 출력
		System.out.println();
		for (String str : v)
			System.out.print(str + " ");
	}
}
