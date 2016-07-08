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
		int userBid, computerBid;
		for (int i = 0; i < 13; i++) {
			System.out.println(game.topOfStock());
			computerBid = computer.strategy();			
			userBid = sc.nextInt();
			playRound(computer, user, computerBid, userBid);
		}
		
		
	}
	public static void main() {
		Main game = new Main();
		game.play();
		System.out.println("Computer Score: " + game.computer.score);
		System.out.println("Computer Score: " + game.user.score);
	}
}
