/**
 * Created by hmly on 7/4/16.
 *
 * Problem 30: Digit fifth powers
 * Answer: 443839
 */
public class p030 implements Euler {

    private static final int LIMIT = 295245; // 9**5 * 5

    public static void main(String[] args) {
        System.out.println(new p030().solve());
    }

    @Override
    public String solve() {
        int sum = 0;

        for (int i = 2; i < LIMIT; i++) {
            if (sumOfFifthPow(i))
                sum += i;
        }
        return Integer.toString(sum);
    }

    private boolean sumOfFifthPow(int n) {
        int d, sum = 0, x = n;

        for (; x > 0; x /= 10) {
            d = x % 10;
            sum += Math.pow(d, 5);
        }
        return n == sum;
    }
}
