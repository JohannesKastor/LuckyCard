public class Card {
	private String Suit;
	private int Number;
	private int Value;
	
	public Card(String Suit, int Number) {
		this.Suit = Suit;
		this.Number = Number;
		this.Value = Number + getSuitBonus(Suit);
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
	
	public int getNumber() {
		return Number;
	}
	
	public String getSuit() {
		return Suit;
	}
	
	
	
}