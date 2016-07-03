import java.math.BigInteger;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 15: Lattice paths
 * Answer: 137846528820
 */
public class p015 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p015().solve());
    }

    @Override
    public String solve() {
        int l = 20, w = 20;
        return factorial(l + w).divide(factorial(l).multiply(
                factorial(w))).toString(); // ((l + w)!) / (l! * w!)
    }

    private BigInteger factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial of negative number");

        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            prod = prod.multiply(BigInteger.valueOf(i));
        return prod;
    }
}
