package beginner.Solved;

public class SquareDifference {
	public static void main(String [] args) {
		long sumOfSquares = 0;
		for (int i = 0; i <= 100; i++) {
			sumOfSquares += (i * i);
		}

		long sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		long squareOfSum = (sum * sum);

		long difference = squareOfSum - sumOfSquares;
		System.out.println(difference);
	}
}
