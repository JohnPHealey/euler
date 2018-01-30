package Solved;

/**
* Solution to Problem #9 on Project Euler
* Finds a*b*c for the special pythagorean triplet where a+b+c=1000
* @author: John Healey, 2016-08-19
*/
public class PythagoreanTriplets {
	public static void main(String [] args) {
		
		boolean done = false;
		while (!done) {
			for (int a = 0; a < 1000; a++) {
				for (int b = 0; b < 1000; b++) {
					for (int c = 0; c < 1000; c++) {
						if ((a*a + b*b == c*c) && (a + b + c == 1000)) {
							System.out.println(a*b*c);
							done = true;
							break;
						}
					}
				}
			}
		}
	}
}
