import java.util.*;
public class Diamond {

	public static int diamondCards() {
		String pipValues = " A23456789TJQK";
		ArrayList<Integer> diamondCard = new ArrayList<Integer>();

		for(int i = 1; i < pipValues.length(); i++) {
			diamondCard.add((pipValues.indexOf(pipValues.charAt(i))));
				}
		return TopofStock(shuffleDiamonds(diamondCard));
	}

	public static ArrayList<Integer> shuffleDiamonds(ArrayList<Integer> s) {
		Collections.shuffle(s);
		return s;
					
		}
	public static int TopofStock(ArrayList<Integer> tos) {
					return tos.get(1);
			}
	}
