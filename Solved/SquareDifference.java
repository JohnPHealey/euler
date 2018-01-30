package Solved;

/**
* Solution to Problem #6 on Project Euler
* Finds the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
* @author: John Healey, 2016-08-16
*/
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
