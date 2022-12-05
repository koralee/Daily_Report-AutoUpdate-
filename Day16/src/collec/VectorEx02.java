package collec;
import java.util.*;
public class VectorEx02 {

	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두","보라","파랑","흰색","주황","남색" };
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		System.out.println("벡터의 크기 : "+v.capacity());
		for(String str : colors)
			v.add(str);
		
		System.out.println("요소의 개수 : "+v.size());
		System.out.println("첫 번째 인덱스 값 : "+v.firstElement());
		System.out.println("두 번째 인덱스 값 : "+v.get(1));
		System.out.println("마지막 인텍스  값 : "+ v.lastElement());

		
		String ss = v.get(1);
		//두 번째 값을 핑크색상으로 변경
		v.set(1, "삥꾸");
		//변경된 값 확인
		System.out.println(ss+" 에서 변경된 두 번째 인덱스의 값을 확인 : "+v.get(1));
		v.remove(1);
		System.out.println("요소의 개수 : "+v.size());
		System.out.println("벡터의 크기 : "+v.capacity()); // 벡터의 저장공간은 2배씩 증가 ! 
		
		//전체 출력
		System.out.println();
		for(String str : v)
			System.out.print(str+" ");
	}
}
