public class testMain {

        public static void main(String[] args) {
		Main game = new Main();
		game.play();
		if (game.computer.score > game.user.score) {
			System.out.println("computer won");
		} else {
			System.out.println("user won");
		}	
	}
}



