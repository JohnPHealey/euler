package beginner.Solved;

public class CountingPrimes {
	public static void main(String [] args) {
		int numPrime = 0;
		int prime = 2;
		boolean done = false;
		while (numPrime < 10001 && !done) {
			if (primeTest(prime)) {
				numPrime++;
			}
			if (numPrime == 10001)
				break;
			prime++;
		}
		System.out.println(prime);
	}

	public static boolean primeTest(int test) {
		for (int i = 2; i < test; i++) {
			if (test % i == 0)
				return false;
		}
		return true;
	}
}
