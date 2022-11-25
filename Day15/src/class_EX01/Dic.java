package class_EX01;

public class Dic {

	private static String kor[] = { "사랑", "아기", "돈", "미래", "희망" };
	private static String eng[] = { "LOVE", "Baby", "Money", "Future", "Hope" };

	public static String kor2Eng(String word) { // 메소드
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return eng[i]; // 워드를 찾았으면 인덱스 i의 영어단어를 리턴
		}
		return null; // 입력한 단어가 없으면 널을 리턴
	}
}
