import java.io.*;

public class Target6 {

	public static int test(int x, int y, int z) {
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			line = reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

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
		if (line.length() > 0) {
			for (int i = 0; i < z; i++) {
				if ((y + i) < z) {
					sum += i;
				}
			} 

		}
		return z / sum;
	}

	public static void main(String[] args)  {
		test(1, 2, 3);
		
	}
}

