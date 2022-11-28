package game;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! Tank >>> x: "+x+" y: "+y);
	}

	@Override
	void stop() {
		System.out.println("Destination?!");
	}

	@Override
	void message() {
		System.out.println("Message : GO, Tank");
	}

	void ChangeMode() {
		System.out.println("Yes. Sir");
	}
}
