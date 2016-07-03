/**
 * Created by hmly on 7/3/16.
 *
 * Problem 7: 10001st prime
 * Answer: 104743
 */
public class p007 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p007().solve());
    }

    @Override
    public String solve() {
        int n = 2;
        for (int i = 0; i < 10001; n++) {
            if (isPrime(n))
                i++;
        }
        return Integer.toString(n - 1);
    }

    private boolean isPrime(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Negative Number");
        if (x < 2)
            return false;
        if (x == 2)
            return true;
        if (x % 2 == 0)
            return false;

        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i+=2) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
