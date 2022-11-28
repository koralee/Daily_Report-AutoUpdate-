package cardSlot;

public class Card {
	Deck D = new Deck();

	public void __str__() {
		System.out.print("[");
		for(int i = 0;i<D.deck.length;i++ ) {
			for(int j = 0;j<D.card.length;j++) {
				System.out.print("'"+D.deck[i]+" "+D.card[j]+"' , ");
			}
			System.out.println();
		}
		System.out.print("]");
	}
}
