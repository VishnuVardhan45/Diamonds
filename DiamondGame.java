import java.util.*;
public class DiamondGame {
	ArrayList<Card> diamondCards;
	Player computer;
	Player user;
	
	DiamondGame() {
		diamondCards = new ArrayList<Integer>();
		computer = new Player('S');
		user = new Player('H');
		String pipValues = "A23456789TJQK";
		for(int i = 0; i < pipValues.length(); i++) {
			diamondCard.add(new Card(pipValues.charAt(i),'D'));
		}
		Collections.shuffle(diamondCards);
	}

	public Card topOfStock() {
		Card c = diamondCards.get(0);
		diamondCards.remove(0); 		
		return c;
	}
	
	public playRound(Player p1, Player p2) {
		Card c1 = p1.bid();
		Card c2 = p2.bid();		
		int diffn = c1.compare(c2);	
		int valOfDiam = topOfStock().getPip();		
		if (diffn < 0) 
			p2.updateScore(valOfDiam);
		else if (diffn > 0) 
			p1.updateScore(valOfDiam);
		else {
			p1.updateScore(valOfDiam/2);
			p2.updateScore(valOfDiam/2);
		}
	}
}
