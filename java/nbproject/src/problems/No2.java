package problems;

public class No2 {

	public static void main(String[] args) {

		long sum = 0;
		long x = 1;
		long y = 2; // y is the new term

		while (y <= 4000000) {
			if (y % 2 == 0) {
				sum += y;
			}

			y += x;
			x = y - x;
		}

		System.out.println(sum);
	}
}
