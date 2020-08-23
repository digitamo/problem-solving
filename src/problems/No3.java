package problems;

//import java.util.ArrayList;

public class No3 {
	public static void main(String[] args) {
		// ArrayList<Integer> primeFactors = new ArrayList<Integer>();

//		add the capital 'L' at th end of the number to tell java that this number is long
		long n = 600851475143L;
		while (true) {
			if (isPrime(n)) {
				// primeFactors.add(n);

				System.out.println("largest prime factor is: " + n);
				break;
			}

			for (int i = 2; i < n; i++) {
				if (!isPrime(i))
					continue;

				if (n % i == 0) {
					// primeFactors.add(i);
					n = n / i;
					break;
				}
			}
		}

		// System.out.println("largest prime factor is: " +
		// primeFactors.get(primeFactors.size() - 1));
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
