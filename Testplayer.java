public class Testplayer {
     
 	public static void main(String[] args) {
		player p1 = new player('S');
		player p2 = new player('H');
		Card computer = p1.bid();
		Card user = p2.bid();
		p1.updateScore();
		p2.updateScore();
		System.out.println("computer score is " + p1.score);
		System.out.println("user score is " + p2.score);
		if(p1.score > p2.score)
		System.out.println("computer won");
		else
		System.out.println("user won");
		
		
