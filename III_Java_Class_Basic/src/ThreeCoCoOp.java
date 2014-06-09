// page 41 of Á¿¸q

public class ThreeCoCoOp {
	public static void main(String[] args) {
		int coverage = 200;
		int area = 300;
		int count = 0;
		count = area / coverage;
		count += (area % coverage == 0) ? 0 : 1;
		String s = (count == 0) ? " can" : " cans";
		System.out.println("Need " + count + s + " to finish the paint job.");
	}
}
