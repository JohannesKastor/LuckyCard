import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List <Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		String[] Suits = {"Diamonds", "Clubs", "Hearts","Spades"};
		for (String suit: Suits) {
			for (int rank =7; rank <= 12; rank++) {
				cards.add(new Card(suit,rank));
			}
		}
		
		shuffle();
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.isEmpty() ? null : cards.remove(0);
	}
	
}
