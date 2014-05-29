package homework_1;
public class NineNine {
	public static void main(String[] args) {
		System.out.println("\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9");												// in the name of simple programming
		System.out.println("-----------------------------------------------------------------------------------");	// and fast execution time
		for (int horizontal = 9; horizontal>=1; horizontal--){
			System.out.print(horizontal + "\t|");
			for (int vertical = 1; vertical <= horizontal; vertical++){
				System.out.print("\t" + vertical * horizontal);
			}
			System.out.println();
		}
	}
}
