package Solved;

import java.math.BigInteger;

/**
* Solution to Problem #16 on Project Euler
* Finds the sum of the digits of the number 2^1000
* @author: John Healey, 2016-08-24
*/
public class PowerDigitSum {
	public static void main(String [] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000); //:D
		System.out.println(number.toString());
		String word = number.toString();
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += Character.getNumericValue(word.charAt(i));
		}
		System.out.println(sum);
	}
}
