import java.util.ArrayList;

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
		String pipValues = "A23456789TJQK";		
		for (int i = 0; i < pipValues.length(); i++) {
			availableCards.add(new Card(pipValues.charAt(i), suit));
			trackOpponent.add(new Card(pipValues.charAt(i), suit));
		}
	}

	public Card bid(int pip) {
		//Card bidding = availableCards.get(availableCards.indexOf(new Card(" A123456789TJQK".charAt(pip), suit)));
		availableCards.remove(new Card(" A123456789TJQK".charAt(pip), suit));
		return new Card(" A123456789TJQK".charAt(pip), suit);
	}

	public void updateScore(double newScore) {
		score += newScore;	
	}	

	public int strategy(int topDiamVal) {
		
		return topDiamVal;
	}
}
