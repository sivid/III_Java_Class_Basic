package homework_1;
public class Loan {
	public static void main(String[] args) {
		double bank=0, pawn=0, underground=0;
		for (int month = 1; month <=12; month++){
			bank = 100000*(java.lang.Math.pow(1+0.2/12, month));
			pawn = 100000*(java.lang.Math.pow(1+0.1, month));
			underground = 100000*(java.lang.Math.pow(1+0.01, month*30));
			System.out.println("month: " + month + ", bank: " + bank + ", pawn shop: " + pawn + ", underground money shop: " + underground);
		}
	}
}
