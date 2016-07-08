public class Testcard {

	public static void main(String[] args) {
  		Card c1 = new Card('A','S');
   		Card c2 = new Card('4','S');
		System.out.println(c1.getPip() + "of" + c1.getSuit());
		System.out.println(c2.getPip() + "of" + c2.getSuit());
		System.out.println(c1.compare(c2));
	}
}
  
 
