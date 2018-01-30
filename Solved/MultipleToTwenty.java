package beginner.Solved;

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
