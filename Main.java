import java.util.*;
public class Main  {
	Player computer;
	Player user;
	
	Main() {
		computer = new Player('S');
		user = new Player('H');	
	}

	public void play() {
		Diamond game = new Diamond();
		int userBid, computerBid;
		for (int i = 0; i < 13; i++) {
			System.out.println(game.topOfStock());
			computerBid = computer.strategy();			
			userBid = sc.nextInt();
			while (!user.availableCards.contains(userBid)) {
				System.out.pritnln("Already played that card. Bid again");
				userBid = sc.nextInt();
			}
			playRound(computer, user, computerBid, userBid);
			computer.trackOpponent.remove(new Card(userBid, user.suit));
		}
		
		
	}
	public static void main() {
		Main game = new Main();
		game.play();
		if(game.computer.score > game.user.score) {
			System.out.prinln("computer won");
		}
		else {
			System.out.println("user won");
		}
		
	}
}
