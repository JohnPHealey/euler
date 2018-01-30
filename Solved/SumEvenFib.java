package Solved;

import java.util.ArrayList;

/**
* Solution to Problem #2 on Project Euler
* Finds the sum of the even Fibonnaci numbers that do not exceed 4 million
* @author: John Healey, 2016-08-12
*/
public class SumEvenFib {
	public static void two() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		long sum = 0;
		int term = 0;
		int i = 2;
		while (term < 4000000) {
			term = numbers.get(i - 2) + numbers.get(i - 1);
			if (term < 4000000)
				numbers.add(term);
			i++;
		}
		for (int j = 0; j < numbers.size(); j++) {
			if (numbers.get(j) % 2 == 0) {
				sum += numbers.get(j);
			}
		}
		System.out.println(sum);
	}
}
