package problems;

public class No7 {

	public static void main(String[] args) {
		long i = 2; // stores the number
		int o = 0; // stores the order of the number
		while (true) {
			if (isPrime(i)) {
				o++;
			}
			if (o == 10001) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}

	private static boolean isPrime(long x) {

		// the fastest way to check if a number is prime or not is to check to
		// the square root of this number
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
