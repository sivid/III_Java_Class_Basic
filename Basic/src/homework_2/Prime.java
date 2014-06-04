package homework_2;

public class Prime {
	public static boolean isPrime(long checkThis){
		for (int j=2;j<Math.sqrt(checkThis);j++){
			if (checkThis%j == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		long[] primes = new long[1000];
		int index = 0;
		long inputValue = 12;					// didn't implement input 
		for (int i=3;i<inputValue;i+=2){
			if (isPrime(i)){
				primes[index] = i;
				index++;
			}
		}
		for (int k=0;k<index;k++){				// print out our answer
			System.out.println(primes[k]);
		}

	}

}
