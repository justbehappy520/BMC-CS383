public class Target {

    public static void test(int x, int y) {
        if (x < y) {
            int z = x - y;
        } else {
            int z =  y / x;
        }

    }

    public static void main(String[] args) {
        test(1, -1);
    }
}
