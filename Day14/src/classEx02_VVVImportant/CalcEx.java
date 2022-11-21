package classEx02_VVVImportant;

import java.io.*;
import java.util.*;

public class CalcEx {
	public static void main(String[] args) throws IOException {
		Calc c = new Calc(); // 객체 선언 및 생성
		
		c.input(); // 입력
		
		int result = c.calculate(); // 처리
		
		c.output(result); // 출력
	}
}
