package beginner.Solved;

public class NumberLetterCounts {
	public static void main(String [] args) {
		int[] small = { 0, 3, 3, 5, 4, 4, 3, 5, 5, 4 };
		int[] teens = { 3, 6, 6, 8, 8, 7, 7, 9, 8, 8 };
		int[] tens = {0, 0, 6, 6, 5, 5, 5, 7, 6, 6 };
		int hundred = 7;
		int and = 3;
		
		int smallSum = 0;
		for (int i = 0; i < 10; i++) {
			smallSum += small[i];
		}
		
		int teenSum = 0;
		for (int i = 0; i < 10; i++) {
			teenSum += teens[i];
		}
		//System.out.println(smallSum + teenSum);
		//System.out.println(3+3+5+4+4+3+5+5+4+3+6+6+8+8+7+7+9+9+8);
		int[] test = extractDigits(57);
		System.out.println(test[0] + "" + test[1] + "" + test[2]);
		
		int tenSum = 0;
		for (int i = 20; i < 100; i++) {
			int[] digits = extractDigits(i);
			int tensPlace = digits[1];
			int onesPlace = digits[2];
			tenSum += tens[tensPlace];
			tenSum += small[onesPlace];
		}
		
		int restSum = 0;
		for (int i = 100; i < 1000; i++) {
			int[] digits = extractDigits(i);
			int hundredsPlace = digits[0];
			int tensPlace = digits[1];
			int onesPlace = digits[2];
			restSum += small[hundredsPlace];
			restSum += hundred;
			if (i % 100 == 0) {}
			else {
				restSum += and;
				if (tensPlace == 1) {
					restSum += teens[onesPlace];
				}
				else {
					restSum += tens[tensPlace];
					restSum += small[onesPlace];
				}
			}
		}
		int result = smallSum + teenSum + tenSum + restSum + 8 + 3;
		System.out.println(result);
	}
	
	public static int[] extractDigits(int i) {
		int[] result = new int[3];
		result[2] = i % 10;
		result[1] = (i / 10) % 10;
		result[0] = (i / 100) % 10;
		return result;
	}
}
