package collec;

import java.util.*;

public class MyVector extends Vector {

	public MyVector() {
		super(1, 1);

	}

	public void addInt(int i) {
		addElement(new Integer(i));
	}

	public void addFloat(float f) {
		addElement(new Float(f));
	}

	public void addString(String s) {
		addElement(s);
	}

	public void addCharArray(char[] a) {
		addElement(a);
	}

	public void write() {
		Object o;
		int length = size();
		for (int i = 0; i < length; i++) {
			o = elementAt(i);
			
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o));
			}else {
			System.out.println(o.toString());
		}}
	}

	public static void main(String[] args) {
		MyVector mv = new MyVector();
		int d = 5;
		float r = 3.14f;
		char[] letters = { 'J', 'A', 'V', 'A' };
		String s = new String("I Love U");
		// String[] S = {"Hellow"};

		mv.addInt(d);
		mv.addFloat(r);
		mv.addCharArray(letters);
		mv.addString(s);

		mv.write();

	}
}
