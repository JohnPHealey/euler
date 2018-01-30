package beginner.Solved;

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
