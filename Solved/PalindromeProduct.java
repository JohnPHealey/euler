package beginner.Solved;

public class PalindromeProduct {
	public static void main(String [] args) {
		int largest = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if ((i * j >= largest) && (palindromeTest(i * j))) {
					largest = i * j;
				}
			}
		}
		System.out.println(largest);
	}

	public static boolean palindromeTest(int test) {
		String forwards = test + "";
		String backwards = "";
		for (int i = forwards.length() - 1; i >= 0; i--) {
			backwards += forwards.charAt(i);
		}
		if (forwards.equals(backwards))
			return true;
		else
			return false;
	}
}
