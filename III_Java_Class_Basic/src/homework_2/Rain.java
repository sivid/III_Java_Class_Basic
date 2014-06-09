package homework_2;

public class Rain {
	public static void main(String[] args) {
		double[][] rainFalls = new double[][]{{55,66,77,66,77,88,99,110,121,132,143,154},
											{55,66,77,66,77,88,99,110,121,132,143,154},
											{55,66,77,66,77,88,99,110,121,132,143,154},
											{55,66,77,66,77,88,99,110,121,132,143,154},
											{55,66,77,66,77,88,99,110,121,132,143,154}};
		double sum = 0.0;
		int secondArg = 0;
		
		if (args.length == 0){
			for (int i=0;i<=4;i++){
				for (int j=0;j<=11;j++){
					sum += rainFalls[i][j];
				}
			}
			System.out.println("Average rainfall of the listed 60 months:" + (sum/60));
		}
		else if (args.length!=2)
			System.out.println("hey!");
		else if (args[0].equals("year")){		// first arg is good
			try {
				secondArg=Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.err.println("The second argument " + args[1] + " must be an integer.");
				System.exit(1);
			}
			if (secondArg>=1 && secondArg<=5){	// both args are good, now do the actual logic of "year"
				for (int i=0;i<=11;i++){
					sum += rainFalls[secondArg-1][i];
				}
				System.out.println("On year " + secondArg + ", average rainfall was " + sum/12);
			}
			else {							// first arg is good, second is bad
				System.out.println("The second argument must be between 1~5");
				System.exit(1);
			}
		} // end "year"
		
		else if (args[0].equals("season")){		// first arg is good
			try {
				secondArg = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.err.println("The second argument " + args[1] + " must be an integer.");
				System.exit(1);
			}
			// both args are good, now do the actual logic of "season 1~4"
			if (secondArg == 1){
				for (int year=0;year<=4;year++){
					sum += rainFalls[year][0];
					sum += rainFalls[year][1];
					sum += rainFalls[year][2];
				}
				System.out.println("average rainfall for all the Springs are " + sum/15);
			}
			else if (secondArg == 2){
				for (int year=0;year<=4;year++){
					sum += rainFalls[year][3];
					sum += rainFalls[year][4];
					sum += rainFalls[year][5];
				}
				System.out.println("average rainfall for all the Summers are " + sum/15);
			}
			else if (secondArg == 3){
				for (int year=0;year<=4;year++){
					sum += rainFalls[year][6];
					sum += rainFalls[year][7];
					sum += rainFalls[year][8];
				}
				System.out.println("average rainfall for all the Falls are " + sum/15);
			}
			else if (secondArg == 4){
				for (int year=0;year<=4;year++){
					sum += rainFalls[year][9];
					sum += rainFalls[year][10];
					sum += rainFalls[year][11];
				}
				System.out.println("average rainfall for all the Winters are " + sum/15);
			}			
			else {							// first arg is good, second is bad
				System.out.println("The second argument must be between 1~4");
				System.exit(1);
			}
		}// end "season"
		
		else if (args[0].equals("month")){		// first arg is good
			try {
				secondArg=Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.err.println("The second argument " + args[1] + " must be an integer.");
				System.exit(1);
			}
			if (secondArg>=1 && secondArg<=12){	// both args are good, now do the actual logic of "month"
				for (int i=0;i<=4;i++){
					sum += rainFalls[i][secondArg-1];
				}
				System.out.println("average rainfall for every month " + secondArg + " is " + sum/5);
			}
			else {							// first arg is good, second is bad
				System.out.println("The second argument must be between 1~12");
				System.exit(1);
			}
		} // end "month"
		else
			System.out.println("The first argument must be \"year\" \"season\" or \"month\"");
	} // end main()

}
