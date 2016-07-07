import java.util.*;
public class Card  {
	char pip;
	String suit;
	
	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}

	public int compare(Card c) {
		return  getPip() - c.getPip()	
	}

	public int getPip() {
		String pipString = " A23456789TJQK";
		return pipString.indexOf(pip);
	}
        public String getPip() {
		
		return suit;
	}          
	
}
