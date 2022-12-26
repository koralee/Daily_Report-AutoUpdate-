package com.threadex;
//상속을 이용

public class SingleThread extends Thread {

	private int[] temp;

	public SingleThread(String ThreadName) {

		super(ThreadName);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}

	}

	@Override
	public void run() {
		for (int start : temp) {
			try {
				sleep(1000);
			} catch (InterruptedException uu) {
				uu.printStackTrace();
			}
			System.out.printf("스레드 이름  : %s,",currentThread().getName());
			System.out.printf("temp valus : %d%n", start);
			
		}
	}

	public static void main(String[] args) {
		SingleThread st = new SingleThread("홍길동");
		st.start();
	}

}
