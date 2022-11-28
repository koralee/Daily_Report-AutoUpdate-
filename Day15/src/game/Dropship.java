package game;

public class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Take it slow. DropShip >>> x: "+x+" y: "+y);
	}

	@Override
	void stop() {
		System.out.println("in the by by by by.....");
	}

	@Override
	void message() {
		System.out.println("Message :: Can i take order...");
	}
}
