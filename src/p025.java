import java.math.BigInteger;

/**
 * Created by hmly on 7/4/16.
 *
 * Problem 25: 1000-digit Fibonacci number
 * Answer: 4782
 */
public class p025 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p025().solve());
    }

    @Override
    public String solve() {
        int iter;
        BigInteger i, j, k;
        j = k = BigInteger.ONE;

        for (iter = 2; countDigits(k) < 1000; iter++) {
            i = k;
            k = k.add(j);
            j = i;
        }
        return Integer.toString(iter);
    }

    private int countDigits(BigInteger n) {
        return n.toString().length();
    }
}
