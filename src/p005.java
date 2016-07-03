import java.math.BigInteger;

/**
 * Created by hmly on 7/2/16.
 *
 * Problem 5: Smallest multiple
 * Answer: 232792560
 */
public class p005 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p005().solve());
    }

    @Override
    public String solve() {
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= 20; i++) {
            n = lcm(n, BigInteger.valueOf(i));
        }
        return n.toString();
    }

    // Computes the least common multiple
    private BigInteger lcm(BigInteger x, BigInteger y) {
        return x.multiply(y).divide(x.gcd(y));
    }
}
