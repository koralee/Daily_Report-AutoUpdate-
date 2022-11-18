package classEx02_VVVImportant;

import java.io.*;
import java.util.*;

public class CalcEx {
	public static void main(String[] args) throws IOException {
		Calc c = new Calc();
		
		c.input();
		
		int result = c.calculate();
		
		c.output(result);
	}
}
