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
			while (!isValid(userBid)))) {
				System.out.println("Already played that card. Bid again");
				userBid = sc.next().charAt(0);
			}
			game.playRound(computer, user, computerBid, " A23456789TJQK".indexOf(userBid));
			computer.trackOpponent.remove(trackOpponent.get());
		}
		
		
	}

	public boolean isValid()
	public static void main(String[] args) {
		Main game = new Main();
		game.play();
		if(game.computer.score > game.user.score) {
			System.out.println("computer won");
		}
		else {
			System.out.println("user won");
		}
		
	}
}
