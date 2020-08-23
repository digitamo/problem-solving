package problems;

public class No6 {
	public static void main(String[] args) {
		long xSum = 0; // xSum is the sum of all the squares
		long ySum = 0; // y Sum is the square of the sum

		for (int i = 0; i <= 100; i++) {
			xSum += i * i;
			ySum += i;
		}

		ySum = ySum * ySum;

		System.out.println("xSum is: " + xSum);
		System.out.println("ySum is: " + ySum);
		System.out.println("result is: " + (ySum - xSum));
	}

}
