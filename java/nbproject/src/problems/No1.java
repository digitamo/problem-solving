package problems;

public class No1 {

	public static void main(String[] args) {
		Long BTime = System.currentTimeMillis();

		long sum = 0;

		// this is faster solution since you only loop the number of multiples
		// not 1000 times but you'll have to watch for the number replications
		for (int i = 1;; i++) {
			if (3 * i < 1000) {
				// System.out.print(3 * i + ", ");
				sum += 3 * i;
			} else {
				break;
			}

			if (5 * i < 1000) {
				// System.out.print(5 * i + ", ");
				if (5 * i % 3 != 0)
					sum += 5 * i;
			}

		}

		// for (int i = 0; i < 1000; i++) {
		// if (i % 3 == 0 || i % 5 == 0) {
		// sum += i;
		// }
		// }

		System.out.println(sum);
		System.out.println("\n" + (long) (System.currentTimeMillis() - BTime));
	}

}