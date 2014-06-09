public class ThreeDimArray {
	public static void main(String[] args) {
		int[][][] threeDimA = new int [2][3][4];
		int count = 0;
		for (int i=0; i<threeDimA.length; i++){
			for (int j=0; j<threeDimA[i].length; j++){
				for (int k=0; k<threeDimA[i][j].length; k++){
					threeDimA[i][j][k] = count++;
				}
			}
		}		
		/*
		for (int i=0; i<threeDimA.length; i++){
			for (int j=0; j<threeDimA[i].length; j++){
				for (int k=0; k<threeDimA[i][j].length; k++){
					System.out.println("i="+i+" j="+j+" k="+k+" value in array is " + threeDimA[i][j][k]);
				}
				System.out.println("================================");
			}
		}
		*/
		
		double[] ar = new double[]{0.5,0.7,1.3};
		double sum = 0;
		for (double d : ar)
			sum += d;
		System.out.println(sum);
	}
}
