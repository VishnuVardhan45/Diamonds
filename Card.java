import java.util.*;

public class Card {
	char pip;
	char suit;

	public Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}

	public int compare(Card c) {
		return getPip() - c.getPip();
	}

	public int getPip() {
		return " A23456789TJQK".indexOf(pip);
	}

	public char getSuit() {

		return suit;
	}

	public String toString() {
		return pip + " of " + suit;
	}
	
	public boolean equals(Card c) {
		return (c.pip == pip && c.suit == suit); 
	}

}
