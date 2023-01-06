package com.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		/*
		 * 		InetAddress : ip정보와 host 정보를 가지는 객체이다
		 * 							 InetAddress 객체는 생성자가 아닌 Static 메소드를 이용해서 생성한다.
		 */
			
		try {
			InetAddress ipInfo1 = InetAddress.getByName("localhost");
			String ip = ipInfo1.getHostAddress();
			System.out.println("ip주소: "+ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.naver.com");
			for(InetAddress ipp : ipArray) {
				System.out.println(ipp);
			}
			
			// 현재의 컴터의 ip 정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("Host : "+myHost.getHostName());
			System.out.println("Host ip : "+myHost.getHostAddress());
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
