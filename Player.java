import java.util.*;
public class Player {
	char suit;
	ArrayList<Card>  available;
	double score;
	
	Player(char suit) {
		this.suit = suit; 
		score = 0;
		available = new ArrayList<>();
		available.add(new Card('A', suit));
		available.add(new Card('2', suit));
		available.add(new Card('3', suit));
		available.add(new Card('4', suit));
		available.add(new Card('5', suit));
		available.add(new Card('6', suit));
		available.add(new Card('7', suit));
		available.add(new Card('8', suit));
		available.add(new Card('9', suit));
		available.add(new Card('J', suit));
		available.add(new Card('Q', suit));
		available.add(new Card('K', suit));
	}

	public Card bid() {
		return available.get(nextInt(available.size()));
	}

	public void updateScore(double newScore) {
		score = newScore;	
	}

	
}
