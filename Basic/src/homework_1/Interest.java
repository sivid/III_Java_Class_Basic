package homework_1;

public class Interest {

	public static void main(String[] args) {
		double s_r = 0.1;
		double c_r = 0.05;
		int n = 0;		// years
		double simple = 0, complex = 0;
		boolean isBigger = true;		// simple rate returns is bigger than complex
		while (isBigger){
			n++;
			simple = 100000*(1+s_r*n);
			complex = 100000*(java.lang.Math.pow(1+c_r, n));
			System.out.println("simple: " + simple + ", complex: " + complex + ", n: " + n);
			if (simple < complex)
				isBigger = false;
		}
		System.out.println("simple: " + simple + ", complex: " + complex + ", n: " + n);
	}

}
