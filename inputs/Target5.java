public class Target5 {

	public static int test(int x, int y, int z) {
		if (x > 0) {
			if (y > x) {
				if (z > y - x) {
					if (x + y + z < 50) {
						System.out.println("Branch A");
					} else if (x + y - z < 20) {
						System.out.println("Branch B");
					}
				}
			} else if (y < -x) {
				if (z + y > x) {
					System.out.println("Branch C");
				}
			}
		} else {
			if (x + y + z == 0) {
				System.out.println("Branch D");
			} else if (x + y > z) {
				if (x - y + z < 10) {
					System.out.println("Branch E");
				}
			}
		}

		int sum = 0;
		if (z < 100) {
			for (int i = 0; i < z; i++) {
				if ((y + i) < z) {
					sum += i;
				}
			} 

		}
		return z / sum;
	}

	public static void main(String[] args) {
		test(1, 2, 3);
	}
}

