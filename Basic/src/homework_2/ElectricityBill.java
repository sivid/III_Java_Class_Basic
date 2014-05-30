package homework_2;

public class ElectricityBill {

	public static void main(String[] args) {
		int eType = 0;			// home == 0, industrial == 1	
		int eAmount = 200;		// how much electricity has been used
		int eLevel = 0;			// level of electricity usage
		double[][] gridMoney = new double[][]{{0.15,0.25,0.45},{0.45,0.45,0.45}};
		if (eAmount <= 240)
			eLevel = 0;
		else if (eAmount <= 540)
			eLevel = 1;
		else
			eLevel = 2;
		System.out.println("Need to pay " + gridMoney[eType][eLevel] * eAmount + " dollars");
	}

}
