package game;

public class UserGame {
	public static void main(String[] args) {
		Unit[] rr = new Unit[3];
		rr[0] = new Marin();
		rr[1] = new Tank();
		rr[2] = new Dropship();
		
		for(int i = 0; i<rr.length;i++) {
			System.out.println("-------------------");
			// 모든 유닛을 좌표 100, 200으로 이동하라.
			rr[i].move(100, 200);
			rr[i].message();
			
			System.out.println("-------------------");
			System.out.println();
		}
	}
}
