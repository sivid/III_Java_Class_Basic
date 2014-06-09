package homework_2;
public class Poker {
	public static void main(String[] args) {
		String[][] pokerCards = new String[4][13];
		// fill pokerCards[][] with cards
		for (int suit=0;suit<=3;suit++){
			for (int cardNum=0; cardNum<=12; cardNum++){
				if (suit == 0)
					pokerCards[suit][cardNum] = "Spade";
				if (suit == 1)
					pokerCards[suit][cardNum] = "Heart";
				if (suit == 2)
					pokerCards[suit][cardNum] = "Diamond";
				if (suit == 3)
					pokerCards[suit][cardNum] = "Club";
				if (cardNum == 0)
					pokerCards[suit][cardNum] += " A";
				if (cardNum>=1 && cardNum <=9)
					pokerCards[suit][cardNum] += (" " + Integer.toString(cardNum+1));
				if (cardNum == 10)
					pokerCards[suit][cardNum] += " J";
				if (cardNum == 11)
					pokerCards[suit][cardNum] += " Q";
				if (cardNum == 12)
					pokerCards[suit][cardNum] += " K";
			}
		}
		/*	check to see if pokerCards was initialized correctly
		for (int suit=0;suit<=3;suit++){
			for (int cardNum=0; cardNum<=12; cardNum++){
				System.out.println(pokerCards[suit][cardNum]);
			}
		}
		*/
		boolean[][] didWeDealThose = new boolean[4][13];				// boolean defaults to false in Java
		String[][] dealThoseCards = new String[4][13];
		for (int i=0; i<=3; i++){										// walk through our empty "suit to be dealt"
			for (int j=0; j<=12; j++){
				int rngThis = (int)(Math.random()*52);					// pick a card in "standard suit"
				int rngSuit = rngThis / 13;
				int rngFace = rngThis % 13;
				if (!didWeDealThose[rngSuit][rngFace]){					// this card has not been dealt yet
					dealThoseCards[i][j] = pokerCards[rngSuit][rngFace];	// pick out the specific card from standard suit, 
					didWeDealThose[rngSuit][rngFace] = true;				// put them in our own array, and remember that this card is now used.
					// System.out.println("rngSuit="+rngSuit+"  rngFace="+rngFace);
				}
				else{
					// ideally i want to get the program to repeat i and j again
					// this should work...
					j--;
				}
			}
		}
		
		// now deal those random(?) cards
		for (int suit=0;suit<=3;suit++){
			System.out.println("=====================group " + (suit+1) + "==================");
			for (int cardNum=0; cardNum<=12; cardNum++){
				System.out.println(dealThoseCards[suit][cardNum]);
			}
		}
	}
}