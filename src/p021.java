/**
 * Created by hmly on 7/5/16.
 *
 * Problem 21: Amicable numbers
 * Answer: 31626
 */
public class p021 implements Euler {

    private static final int LIMIT = 10000;

    public static void main(String[] args) {
        System.out.println(new p021().solve());
    }

    @Override
    public String solve() {
        int sum  = 0;
        for (int i = 2; i < LIMIT; i++) {
            if (isAmicable(i))
                sum += i;
        }
        return Integer.toString(sum);
    }

    private boolean isAmicable(int n) {
        int m = divisorSum(n);
        return n != m && n == divisorSum(m);
    }

    private int divisorSum(int n) {
        int sum = 1; // all numbers are divisible by one
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                sum += n;
        }
        return sum;
    }
}
