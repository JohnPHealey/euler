package Solved;

/**
* Solution to Problem #7 on Project Euler
* Finds the 10001st prime number
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
