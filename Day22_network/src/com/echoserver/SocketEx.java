package com.echoserver;

import java.net.*;

//쉽게말해서 Client == Slave
public class SocketEx {
	public static void main(String[] args) {
		try {
			//Socket s = new Socket("localhost", 3000);
			Socket s = new Socket("192.168.0.113", 3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
