package homework_2;

public class TwoDimArray {
	public static double arrayGroupAverages(int[][] array, int row){
		int sum=0;
		for (int i=0;i<=3;i++){
			sum += array[row][i];
		}
		return (double)sum/4.0;
	}
	public static double arrayAllAverages(int[][] array){
		int sum=0;
		for (int i=0;i<=2;i++){
			for (int j=0;j<=3;j++){
				sum+=array[i][j];
			}
		}
		return (double)sum/12.0;
	}
	public static int arrayMaxElement(int[][] array){
		int max=0;
		for (int i=0;i<=2;i++){
			for (int j=0;j<=3;j++){
				if (max < array[i][j])
					max = array[i][j];
			}
		}
		return max;
	}
	public static int arrayMinElement(int[][] array){
		int min=array[0][0];
		for (int i=0;i<=2;i++){
			for (int j=0;j<=3;j++){
				if (min > array[i][j])
					min = array[i][j];
			}
		}
		return min;
	}
	/*
	public static void printArray(int[][] array){
		for (int i=0;i<=2;i++){
			for (int j=0;j<=3;j++)
				System.out.print(" " + array[i][j]);
			System.out.println();
		}
	}*/
	public static void main(String[] args) {
		int[][] array = new int[][]{{1,2,3,4},
									{5,6,7,8},
									{9,10,11,12}};
		System.out.println("average of row 0 is " + arrayGroupAverages(array, 0));
		System.out.println("average of row 1 is " + arrayGroupAverages(array, 1));
		System.out.println("average of row 2 is " + arrayGroupAverages(array, 2));
		System.out.println("average of all elements is " + arrayAllAverages(array));
		System.out.println("max element is " + arrayMaxElement(array));
		System.out.println("min element is " + arrayMinElement(array));
		// System.out.println(array.length);
		// System.out.println(array[0].length);
		// printArray(array);
	}

}
