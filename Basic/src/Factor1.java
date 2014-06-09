public class Factor1 {
	static long factorial(long n){
		long fact=1;
		for (long a=1;a<=n;a++){
			fact = a*fact;
		}
		return fact;
	}
	static long factorial_recursive(long n){
		if(n>=1){
			return n*factorial_recursive(n-1);
		}
		else
			return 1;
	}
	public static void main(String[] args) {
		// System.out.println(factorial(39));
		System.out.println(factorial_recursive(Integer.parseInt(args[0])));
	}

}
