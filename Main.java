import java.util.*;
public class Main  {
	Player computer;
	Player user;
	
	Main() {
		computer = new Player('S');
		user = new Player('H');	
	}

	public void play() {
		DiamondGame game = new DiamondGame();
		int computerBid;
		int userBid;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 13; i++) {
			int topDiam = game.topOfStock();
			System.out.println(topDiam);
			computerBid = computer.strategy(topDiam);			
			userBid = sc.nextInt();
			while (!isValid(userBid)) {
				System.out.println("Already played that card. Bid again");
				userBid = sc.nextInt();
			}
			game.playRound(computer, user, computerBid, userBid);
			computer.trackOpponent.remove(new Card(" A23456789TJQK".charAt(userBid), user.suit));
		}	
	}
	
	public boolean isValid(int pip) {
		for (Card c : user.availableCards) {
			if (c.pip == pip)
				return false;
		}
		return true;
	}
	
	
}
