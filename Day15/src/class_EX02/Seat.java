package class_EX02;

public class Seat {
	private String name;

	public Seat() {
		name = null;
	}

	public String getName() {
		return name;
	}

	public void cancel() {
		name = null; // 취소하는 것으므로 null 값 입력!
	}

	public void reserve(String name) {
		this.name = name;
	}

	// 이름 유무
	public boolean match(String name) {
		return (name.equals(this.name));
		// (입력된 이름과 저장되어있던 이름이 같다면)을! 리턴!
	}

	// 좌석 유무
	public boolean isOccupied() {
		if (name == null) // 좌석에 이름이 없다면
			return false; // 호출된 곳 끝!으로 false로 돌아감
		else
			return true;// 호출된 곳으로 true로 돌아감
	}
}
