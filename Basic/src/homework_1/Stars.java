package homework_1;

public class Stars {

	public static void main(String[] args) {
		/*
		 * (1)
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		System.out.println("(1)");		// indicator for (1)
		int a1 = 1;	// lines
		int a2 = a1;	// spaces before the first star in each line.
		int a3 = 1;	// stars to draw in each line.
		for (a1 = 1; a1 <= 5; a1++){		// lines
			for (a2 = 5 - a1; a2 >= 0; a2--){
				System.out.print(" ");
			}
			for (a3 = 1; a3 <= a1*2-1; a3++){
				System.out.print("*");
			}
			System.out.println();
		}	// end of (1)
		
		/*
		 * (2)
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		System.out.println("(2)");		// indicator for (2)
		for (int b1 = 1; b1 <= 5; b1++){	// lines
			for (int b2 = 1; b2 <= b1; b2++){	// stars
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * (3)
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		System.out.println("(3)");		// indicator for (3)
		for (int c1 = 1; c1 <= 5; c1 ++){	// lines
			for (int c2 = 1; c2 <= c1-1; c2++){		// spaces
				System.out.print(" ");
			}
			for (int c3 = 5; c3 > c1-1; c3--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
