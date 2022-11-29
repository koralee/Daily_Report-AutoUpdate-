package absex_Class;

public class Point3D extends Point{
	
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	private void moveDown() {
		z--;
	}

	private void moveUp() {
		z++;		
	}
	
	protected int getZ() {
		return z;
	}

	protected void setZ(int z) {
		this.z = z;
	}
	
	private void move(int x, int y, int z) {
		move(x, y);
		this.z=z;
		
	}
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() +") ";
	}

	
	public static void main(String[] args) {
		Point3D P = new Point3D(1,2,3); // 1,2,3 은 각각 x,y,z 축의 값을 의미함.
		System.out.println(P.toString()+":입니다");
		
		P.moveUp();// z축으로 위로 이동
		System.out.println(P.toString()+":입니다");

		P.moveDown();// z축으로 아래로 이동
		P.move(10,10);
		System.out.println(P.toString()+":입니다");
		
		P.move(100,200,300);
		System.out.println(P.toString()+":입니다");
	}


}
