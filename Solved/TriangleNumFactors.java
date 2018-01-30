package beginner.Solved;

public class TriangleNumFactors {
		public static void main(String [] args) {
			int number = 0;
			for (int i = 1; i < 500000; i++) {
				number += i;
				int numFactors = countFactors(number);
				if (numFactors > 500) {
					System.out.println(number);
					break;
				}
			}
			System.out.println("End");
		}

		public static int countFactors(int toCount) {
			int numFactors = 0;
			for (int i = 1; i <= toCount; i++) {
				if (toCount % i == 0) {
					numFactors++;
				}
			}
			return numFactors;
		}
	}

