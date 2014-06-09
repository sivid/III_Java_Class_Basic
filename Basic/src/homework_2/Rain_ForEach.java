package homework_2;

public class Rain_ForEach {

	public static void main(String[] args) {
		int[][] rainFalls = new int[][]{{55,66,77,66,77,88,99,110,121,132,143,154},
				{55,66,77,66,77,88,99,110,121,132,143,154},
				{55,66,77,66,77,88,99,110,121,132,143,154},
				{55,66,77,66,77,88,99,110,121,132,143,154},
				{55,66,77,66,77,88,99,110,121,132,143,154}};
		// try to use For Each to calculate average of all month rainfalls
		int sum_yearly = 0;
		for (int[] i : rainFalls)
			for (int j : i)
				sum_yearly += j;
		System.out.println("average of 60 months is " + sum_yearly/60);
		
		// sadly we can't easily do Seasonal rainfalls using For Each, 
		// reason here: http://stackoverflow.com/questions/477550/is-there-a-way-to-access-an-iteration-counter-in-javas-for-each-loop
		/* The reason for this is that the for-each loop internally does not have a counter; 
		 * it is based on the Iterable interface, i.e. it uses an Iterator to loop through the "collection" - which
		 *  may not be a collection at all, and may in fact be something not at all based on indexes (such as a linked list)
		 */
	}

}
