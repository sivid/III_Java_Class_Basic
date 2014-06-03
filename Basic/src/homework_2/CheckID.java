package homework_2;


public class CheckID {
	public static boolean RealCheckID(String inputID){				// returns true if input is valid
		if (inputID.length() != 10){
			System.err.println("input was not 10 chars");
			return false;
		}
		char headLetter = inputID.charAt(0);
		if (!((headLetter >= 'a' && headLetter <= 'z') || (headLetter >='A' && headLetter <= 'Z'))) { // because we don't need Unicode here
			System.err.println("starting letter was not english alphabet");
			return false;
		}
		if (!inputID.substring(1,10).matches("[0-9]+")){
			System.err.println("input elements 2~10 are not numeric");
			return false;
		}
		
		char[][] matchingHeadLetter=new char[][]{{'A',1,0},{'B',1,1},{'C',1,2},{'D',1,3},{'E',1,4},{'F',1,5},
												{'G',1,6},{'H',1,7},{'I',3,4},{'J',1,8},{'K',1,9},{'M',2,1},
												{'N',2,2},{'O',3,5},{'P',2,3},{'Q',2,4},{'T',2,7},{'U',2,8},
												{'V',2,9},{'W',3,2},{'X',3,0},{'Z',3,3},{'L',2,0},{'R',2,5},
												{'S',2,6},{'Y',3,1}};
		int headLetterIntOne = 0;
		int headLetterIntTwo = 0;
		for (int i=0;i<=25;i++){
			if (inputID.charAt(0) == (matchingHeadLetter[i][0])){
				headLetterIntOne = matchingHeadLetter[i][1];
				headLetterIntTwo = matchingHeadLetter[i][2];
				// System.out.println("int1: "+headLetterIntOne+"  int2: " +headLetterIntTwo);
				// System.out.println("char: "+matchingHeadLetter[i][0]);
				i=26;
			}
		}
		int checkSum = 0;
		int[] arrayNum = new int[9];
		for (int i=1;i<=9;i++){
			arrayNum[i-1] = Character.getNumericValue(inputID.charAt(i)); 
		}
		checkSum = headLetterIntOne + headLetterIntTwo*9 + arrayNum[0]*8 + arrayNum[1]*7 + arrayNum[2]*6 + arrayNum[3]*5
					+ arrayNum[4]*4 + arrayNum[5]*3 + arrayNum[6]*2 + arrayNum[7]*1 + arrayNum[8]*1;
		System.out.println("Checksum is " + checkSum);
		if (checkSum%10==0)
			return true;
		else {
			System.err.println("something's wrong with this ID");
			return false;
		}
	} // end RealCheckID()
	
	public static void main(String[] args) {
		if (args.length != 1){
			System.err.println("Please input exactly One argument.");
			System.exit(1);
		}
		String inputID = args[0].toUpperCase();
		if (!RealCheckID(inputID))									// input is not valid
			System.exit(1);
		else
			System.out.println("yay it passed");

		
	} // end main()
}
