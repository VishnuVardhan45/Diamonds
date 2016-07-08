import java.util.*;
public class DiamondGame {
	ArrayList<Card> diamondCards;
	DiamondGame() {
		diamondCards = new ArrayList<Integer>();
		String pipValues = "A23456789TJQK";
		for(int i = 0; i < pipValues.length(); i++) {
			diamondCard.add(new Card(pipValues.charAt(i),'D'));
		}
		Collections.shuffle(diamondCards);
	}

	public static int topOfStock(ArrayList<Integer> tos) {
		return tos.get(0);
	}

}
