import java.util.ArrayList;
import java.util.Random;
public class Player {
	char suit;
	ArrayList<Card>  availableCards;
	int score;

	Player(char suit) {
		this.suit = suit; 
		score = 0;
		availableCards = new ArrayList<>();
		availableCards.add(new Card('A',suit));
		availableCards.add(new Card('2',suit));
		availableCards.add(new Card('3',suit));
		availableCards.add(new Card('4',suit));
		availableCards.add(new Card('5',suit));
		availableCards.add(new Card('6',suit));
		availableCards.add(new Card('7',suit));
		availableCards.add(new Card('8',suit));
		availableCards.add(new Card('9',suit));
		availableCards.add(new Card('T',suit));
		availableCards.add(new Card('J',suit));
		availableCards.add(new Card('Q',suit));
		availableCards.add(new Card('K',suit));		
	}

	public Card bid() {
		Random r = new Random();
		int index = r.nextInt(availableCards.size());
		Card bidding = availableCards.get(index);
		availableCards.remove(index);
		return bidding;
	}
}
