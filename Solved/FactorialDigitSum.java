package Solved;

import java.math.BigInteger;

/**
* Solution to Problem #20 on Project Euler
* Finds the sum of the digits of 100!
* @author: John Healey, 2016-08-28
*/
public class FactorialDigitSum {

	public static void main(String [] args) {
		BigInteger number = new BigInteger("100");
		for (int i = 99; i > 1; i--) {
			BigInteger factor = new BigInteger(i + "");
			System.out.println(factor.toString());
			number = number.multiply(factor);
			System.out.println(number.toString());
		}
		String digits = number.toString();
		System.out.println(digits);
		int sum = 0;
		for (int i = 0; i < digits.length(); i++) {
				String toAdd = digits.charAt(i) + "";
				int adding = Integer.parseInt(toAdd);
				sum += adding;
		}
		System.out.println(sum);
	}
}
