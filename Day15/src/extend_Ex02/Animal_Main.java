package extend_Ex02;

public class Animal_Main {
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		Animal_Hospital hp = new Animal_Hospital();
		hp.inject(dog);
		System.out.println();
		hp.inject(cat);
		System.out.println();
		hp.inject(tiger);
	}
}
