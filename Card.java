import java.util.*;
public class Card  {
	char pip;
	char suit;
	
	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}

	public String compare(Card c) {
		String pipString = " A23456789TJQK";
		String suitString = "CDHS";
		int card1Value = pipString.indexOf(pip) + 13 * suitString.indexOf(suit);
		
		int card2Value = pipString.indexOf(c.pip) + 13 * suitString.indexOf(c.suit);	
		int difference = card1Value - card2Value;

		if (difference < 0)
			return "Card 2 is greater";
 		else
			return "Card 1 is greater";	
	}

	public String toString() {
		return pip + " of " + suit;
	}
	
}
