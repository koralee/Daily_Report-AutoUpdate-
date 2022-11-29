package game;

/*
 * ColorTV 를 상속받아 IPTV를 구현하시오
 * IPTV  iptv = new IPTV("192.1.1.2",32.2048)
 * iptv.prt();
 * 
 * IP주소 : 192.1.1.2 주소의 32인치 2048 컬러
 * 
 */


public class IPTV extends ColorTV{

	String IP;
	public IPTV(String IP, int size, int Color) {
		super(size, Color);
		this.IP = IP;
	}
	
	protected String getIP() {
		return IP;
	}
	@Override
	public void prt() {
		System.out.print("나의 IPTV : "+IP+" 주소의 ");
		super.prt();
	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.prt();
	}

}
