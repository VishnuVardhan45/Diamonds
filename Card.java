import java.util.*;
public class Card implements Comparator<Card> {
	char pip;
	char suit;
	
	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}

	public int compare(Card c1, Card c2) {
		String pipString = " A23456789TJQK";
		String suitString = "CDHS";
		card1Value = pipString.indexOf(c1.pip) + 13 * suitString.indexOf(c1.suit);
		
		card2Value = pipString.indexOf(c2.pip) + 13 * suitString.indexOf(c2.suit);	
		
		retrun card1Value - card2Value;	
	}
	
}
