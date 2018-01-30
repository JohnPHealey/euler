package beginner.Solved;

public class SumOfPrimes {
	public static void main(String [] args) {
		long sum = 0;
		for (int i = 2; i < 2000000; i++) {
			if (primeTest(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean primeTest(int test) {
		if (test == 2) {
			return true;
		}
		for (int i = 2; i < test; i++) {
			if (test % i == 0)
				return false;
		}
		return true;
	}
}
