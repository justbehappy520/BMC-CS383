public class Target4 {

	public static void test(int x) {
		int y = 0;
		if (x > 0) {
			y = x * x;
		} else if (x == 0) {
			y = -10;
		} else {
			if (x > -5) y = x + 5;
			else y = x * -1;
		}

		if (x + 2 == 0) y = x;
		else y = x + 1;

		int z = y / x;
	}

	public static void main(String[] args) {
		test(1);
	}
}
