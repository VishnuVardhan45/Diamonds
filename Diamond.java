import java.util.*;
public class Diamond {
	ArrayList<Card> diamondCards;
	int topDiamVal; 
	
	Diamond() {
		diamondCards = new ArrayList<Integer>();
		String pipValues = "A23456789TJQK";
		for(int i = 0; i < pipValues.length(); i++) {
			diamondCards.add(new Card(pipValues.charAt(i),'D'));
		}
		Collections.shuffle(diamondCards);
		topDiamVal = diamondCards.getPip(0);
	}

	public int  topOfStock() {
		topDiamVal = diamondCards.getPip(0);
		diamondCards.remove(0); 		
		return topDiamVal;
	}
	
	public void playRound(Player p1, Player p2) {
		Card c1 = p1.bid();
		Card c2 = p2.bid();		
		int diffn = c1.compare(c2);			
		if (diffn < 0) 
			p2.updateScore(topDiamVal);
		else if (diffn > 0) 
			p1.updateScore(topDiamVal);
		else {
			p1.updateScore(topDiamVal/2);
			p2.updateScore(topDiamVal/2);
		}
	}
}
