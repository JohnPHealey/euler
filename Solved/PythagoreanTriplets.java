package beginner.Solved;

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
