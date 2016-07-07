import java.util.*;
public class Card  {
	char pip;
	String suit;
	
	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}

	public String compare(Card c) {
		
		//String suitString = "CDHS";
		int card1Value = getPip(); //+ 13 * suitString.indexOf(suit);
		
		int card2Value = getPip(); //+ 13 * suitString.indexOf(c.suit);	
		int difference = card1Value - card2Value;

		if (difference < 0)
			return "Card 2 is greater";
 		else
			return "Card 1 is greater";	
	}

	public int getPip() {
		String pipString = " A23456789TJQK";
		return pipString.indexOf(pip);
	}
        public String getPip() {
		
		return suit;
	}          
	
}
