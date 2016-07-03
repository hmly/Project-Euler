import java.math.BigInteger;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 20: Factorial digit sum
 * Answer: 648
 */
public class p020 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p020().solve());
    }

    @Override
    public String solve() {
        BigInteger n = BigInteger.ONE;
        String fact;
        int i, sum = 0;

        for (i = 2; i <= 100; i++)
            n = n.multiply(BigInteger.valueOf(i));
        fact = n.toString();
        for (i = 0; i < fact.length(); i++)
            sum += fact.charAt(i) - '0';

        return Integer.toString(sum);
    }
}
