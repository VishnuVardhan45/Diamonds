public class Diamond {

	public static ArrayList<Integer> diamondCards() {
		String pipValues = " A23456789TJQK";
		ArrayList<Integer> diamondCard = new ArrayList<Integer>();

		for(int i = 1; i < pipValues.length(); i++) {
			diamondCard.add((pipValues.indexOf(pipValues.charAt(i))));
				}
		return shuffleDiamonds(diamondCard);
	}

	public static ArrayList<Integer> shuffleDiamonds(ArrayList<Integer> s) {
		Collections.shuffle(s);
		return s;
					
		}
	}
