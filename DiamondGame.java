import java.util.*;
public class DiamondGame {
	ArrayList<Card> diamondCards;
	int topDiamVal; 
	
	DiamondGame() {
		diamondCards = new ArrayList<Card>();
		String pipValues = "A23456789TJQK";
		for(int i = 0; i < pipValues.length(); i++) {
			diamondCards.add(new Card(pipValues.charAt(i),'D'));
		}
		Collections.shuffle(diamondCards);
		topDiamVal = diamondCards.get(0).getPip();
	}

	public int  topOfStock() {
		topDiamVal = diamondCards.get(0).getPip();
		diamondCards.remove(0); 		
		return topDiamVal;
	}
	
	public void playRound(Player p1, Player p2,int bid1,int bid2) {
		Card c1 = p1.bid(bid1);
		Card c2 = p2.bid(bid2);		
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
