import java.util.ArrayList;
import java.util.Random;
public class Player {
	char suit;
	ArrayList<Card>  availableCards;
	ArrayList<Card> trackOpponent;
	double score;

	Player(char suit) {
		this.suit = suit; 
		score = 0;
		availableCards = new ArrayList<>();
		trackOpponent = new ArrayList<>();
		String pipValues = "A23456789JQK";		
		for (int i = 0; i < pipValues.length(); i++) {
			availableCards.add(new Card(pipValues.charAt(i), suit));
<<<<<<< HEAD
=======
			trackOpponent.add(new Card(pipValues.charAt(i), suit));
>>>>>>> b7bd19cf8c2c09af4723faf71b129e55dfe87281
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

	public int strategy(int topDiamVal) {
		return topDiamVal;
	}
}
