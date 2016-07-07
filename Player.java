import java.util.*;
public class Player {
	char suit;
	ArrayList<Card>  available;
	int valueAccumulated;

	Player(char suit) {
		this.suit = suit; 
		score = 0;
		available = new Arraylist<>();
		available.put(new Card('A',suit));
		available.put(new Card('2',suit));
		available.put(new Card('3',suit));
		available.put(new Card('4',suit));
		available.put(new Card('5',suit));
		available.put(new Card('6',suit));
		available.put(new Card('7',suit));
		available.put(new Card('8',suit));
		available.put(new Card('9',suit));
		available.put(new Card('T',suit));
		available.put(new Card('J',suit));
		available.put(new Card('Q',suit));
		available.put(new Card('K',suit));		
	}
}
