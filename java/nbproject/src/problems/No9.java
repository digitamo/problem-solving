package problems;

public class No9 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		// note that a<b<c

		outer: for (a = 1; a < 1000; a++){
			for (b = a + 1; b < 1000; b++){
				for (c = b + 1; c < 1000; c++){
					if(isPythagorean(a, b, c) && (a + b + c) == 1000){
						System.out.println("a is: " + a);
						System.out.println("b is: " + b);
						System.out.println("c is:" + c);
						
						System.out.println("a * b * c = " + a * b * c);
						break outer;
					}
				}
			}
		}
	}

	private static boolean isPythagorean(int a, int b, int c) {
		if (((a * a) + (b * b)) == (c * c)) {
			return true;
		}

		return false;
	}

//	private static int findC(int a, int b) {
//		return (int) Math.sqrt((a * a + b * b));
//	}
}
