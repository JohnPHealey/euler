package beginner.Solved;

/**
* Solution to Problem #5 on Project Euler
* Finds the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
* @author: John Healey, 2016-08-15
*/
public class MultipleToTwenty {
	public static void main(String [] args) {
		
		int test = 21;
		boolean done = false;
		while (!done) {
			for (int i = 1; i <= 20; i++) {
				if (test % i != 0)
					break;
				if (i == 20 && test % 20 == 0) {
					System.out.println(test);
					done = true;
				}
			}
			test++;
		}
	}
}
