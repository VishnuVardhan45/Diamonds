import java.util.*;
public class Game {
	Player computer;
	Player user;
	
	Game() {
		computer = new Player('S');
		user = new Player('H');	
	}

	public void play() {
		DiamondGame game = new DiamondGame();
		int userBid, computerBid;
		for (int i = 0; i < 13; i++) {
			System.out.println(game.topOfStock());
			computerBid = computer.strategy();			
			userBid = sc.nextInt();
			playRound(computer, user, computerBid, userBid);
		}
		
		
	}
	public static void main() {
		Game g = new Game();
		g.play();
		System.out.println("Computer Score: " + g.computer.score);
		System.out.println("Computer Score: " + g.user.score);
	}
}
