public class Card {
	private String Suit;
	private int Rank;
	private int Value;
	
	public Card(String Suit, int Rank) {
		this.Suit = Suit;
		this.Rank = Rank;
		this.Value = Rank + getSuitBonus(Suit);
	}
	
	private int getSuitBonus(String Suit) {
		switch (Suit) {
		case "Diamonds": return 4;
		case "Clubs": return 6;
		case "Hearts": return 8;
		case "Spades": return 10;
		default: return 0;
		
		}
				
	}
	
	public int getValue() {
		return Value;
	}
	
	public int getRank() {
		return Rank;
	}
	
	public String getSuit() {
		return Suit;
	}
	
    @Override
    public String toString() {
        return Suit + " " + Rank + " -> Value = " + Value;
    }
	
}