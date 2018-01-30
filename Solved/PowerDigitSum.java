package beginner.Solved;

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String [] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		System.out.println(number.toString());
		String word = number.toString();
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += Character.getNumericValue(word.charAt(i));
		}
		System.out.println(sum);
	}
}
