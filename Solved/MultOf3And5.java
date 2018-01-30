package Solved;

/**
* Solution to Problem #1 on Project Euler
* Finds the sum of all multiples of 3 or 5 below 1000
* @author: John Healey, 2016-08-12
*/
public class MultOf3And5 {
	public static void one() {
		long sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0  || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
