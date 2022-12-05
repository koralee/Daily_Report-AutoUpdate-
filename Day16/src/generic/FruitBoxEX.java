package generic;

import java.util.ArrayList;

class Box<T> { // T = type
	ArrayList<T> list = new ArrayList<T>(); // E = Elements

	public void add(T item) {
		list.add(item);
	}

	T get(int i) { // 반환형이 T = type
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
}

public class FruitBoxEX {
	public static void main(String[] args) {

		Box<Fruit> fruitbox = new Box<Fruit>(); // 과일만 들어 올 수 있다.
		Box<Apple> applebox = new Box<Apple>(); // 사과만 들어 올 수 있음.
		Box<Toy> toybox = new Box<Toy>(); // 장난감만 들어 올 수 있음.
		Box<Grape> grapebox = new Box<Grape>(); // 포토만 들어 올 수 있음.
		
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple()); // fruit을 상속받아서 가능
		fruitbox.add(new Apple());
		fruitbox.add(new Grape()); // fruit을 상속받아서 가능
		fruitbox.add(new Grape());

		applebox.add(new Apple());
		applebox.add(new Apple());
		applebox.add(new Apple());
		
		grapebox.add(new Grape());
		grapebox.add(new Grape());
		
		toybox.add(new Toy());
		
		
		System.out.println(fruitbox);	//리스트를 출력
		System.out.println(applebox);	//리스트를 출력
		System.out.println(grapebox);	//리스트를 출력
		System.out.println(toybox);		//리스트를 출력
		
		System.out.println();
		for(int i = 0;i<fruitbox.size();i++) { //리스트가 아닌 내용을 꺼내서 출력
			System.out.print(fruitbox.get(i)+" ");
		}
		System.out.println();
		for(int i = 0;i<applebox.size();i++) { //리스트가 아닌 내용을 꺼내서 출력
			System.out.print(applebox.get(i)+" ");
		}
		System.out.println();
		for(int i = 0;i<grapebox.size();i++) { //리스트가 아닌 내용을 꺼내서 출력
			System.out.print(grapebox.get(i)+" ");
		}
		System.out.println();
		for(int i = 0;i<toybox.size();i++) { //리스트가 아닌 내용을 꺼내서 출력
			System.out.print(toybox.get(i)+" ");
		}
			
	}
}
