package Solved;

import java.util.ArrayList;
import java.math.BigInteger;

/**
* Solution to Problem #14 on Project Euler
* Finds the longest Collatz sequence (see problem description at https://projecteuler.net/problem=14)
* @author: John Healey, 2016-08-22
*/
public class LongestCollatzSequence {
	public static void main(String [] args) {
		
		ArrayList<BigInteger> largest = new ArrayList<>();
		int largestFinal = 0;
		for (int i = 1; i < 1000000; i++) {
			ArrayList<BigInteger> test = makeCollatz(new BigInteger(i + ""));
			if (test.size() > largest.size()) {
				largest = test;
				largestFinal = i;
			}
		}
		System.out.println(largestFinal);
	}
	
	public static ArrayList<BigInteger> makeCollatz(BigInteger thing) {
		ArrayList<BigInteger> toReturn = new ArrayList<>();
		toReturn.add(thing);
		while (thing.compareTo(new BigInteger("1")) > 0) {
			if (thing.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
				thing = thing.divide(new BigInteger("2"));
			}
			else {
				thing = (thing.multiply(new BigInteger("3")).add(new BigInteger("1")));
			}
			toReturn.add(thing);
		}
		return toReturn;
	}
}
