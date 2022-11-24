package extend_Ex02;

public class Dog extends Animal {

	private String name;

	public Dog() {
		name = getClass().getSimpleName(); // 클래스 명을 이름으로 사용!한다는 코드
	}

	public String getName() {
		return name;
	}

@Override
public String scream() {
	// TODO Auto-generated method stub
	return "멍멍멍~";
}

}
