import java.util.ArrayList;
import java.util.Random;
public class Player {
	char suit;
	ArrayList<Card>  availableCards;
	double score;

	Player(char suit) {
		this.suit = suit; 
		score = 0;
		availableCards = new ArrayList<>();
		String pipValues = "A23456789JQK";		
		for (int i = 0; i < pipValues.length(); i++) {
			availableCards.add(new Card(pipValues.charAt(i), suit);
		}
	}

	public Card bid(int pip) {
		int index = pip;;
		Card bidding = availableCards.get(index);
		availableCards.remove(index);
		return bidding;
	}

	public void updateScore(double newScore) {
		score += newScore;	
	}	
}
