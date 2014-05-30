package homework_2;

public class Prime {
	public static boolean isPrime(long checkThis){
		for (int j=2;j<checkThis;j++){
			if (checkThis%j == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		long[] primes = new long[1000];
		int index = 0;
		long inputValue = 55;
		for (int i=1;i<inputValue;i+=2){
			if (isPrime(i)){
				primes[index] = i;
				index++;
			}
		}
		for (int k=0;k<index;k++){
			System.out.println(primes[k]);
		}

	}

}
