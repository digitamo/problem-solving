package problems;

import java.util.ArrayList;

public class No4 {

	public static void main(String[] args) {
		int digit1 = 999;
		int digit2 = 999;
		ArrayList<Long> palindromics = new ArrayList<Long>();

		outer: while (digit1 > 0) {
			while (digit2 > 0) {
				if (digit2 / 100 == 0) {
					// break; // may break the current loop but this will loop
					// extra not necessary loops

					// decrement and start over again
					digit1--;
					digit2 = digit1;
					continue outer;
				}

				if (isPalindromic(digit1 * digit2)) {

					/*
					 * System.out.println("digit #1 is: " + digit1);
					 * System.out.println("digit #2 is: " + digit2);
					 * System.out.println(digit1 * digit2);
					 * 
					 * break outer; // number is found :D if you're searching //
					 * for one item
					 */palindromics.add((long) (digit1 * digit2));
				}
				digit2--;
			}
		}

		long max = 0;
		for (int i = 0; i < palindromics.size(); i++) {
			if (palindromics.get(i) > max)
				max = palindromics.get(i);
		}

		System.out.println("largest palindromic number is: " + max);
	}

	private static boolean isPalindromic(long x) {
		long b = 0;

		// if the number ends with zero then it cann't be palindroimic.
		if (x % 10 == 0)
			return false;

		while (x >= b) {
			if (x == b)
				return true;
			b = 10 * b + x % 10;
			if (x == b)
				return true;
			x = x / 10;
		}
		return false;
	}

}