public class Factor {
	static long factorial(long n){
		if (n==0)
			return 1;
		long fact=1;
		for (long a=2;a<=n;a++){
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
		System.out.println(factorial(9));
		System.out.println(factorial_recursive(5));
	}

}
