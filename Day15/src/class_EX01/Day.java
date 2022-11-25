package class_EX01;

public class Day {

	private String work;

	public void set(String work) {
		this.work = work;
	}

	public void show() {
		if (work == null)
			System.out.println("할 일이 없습니다. ");
		else
			System.out.println(work + "로 인해 쫄라 바쁩니다.");
	}
}
