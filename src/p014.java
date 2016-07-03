import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 14: Longest Collatz sequence
 * Answer: 837799
 */
public class p014 implements Euler {

    private static final int LIMIT = 1000000;
    private static int[] numSeq = new int[LIMIT];

    public static void main(String[] args) {
        System.out.println(new p014().solve());
    }

    @Override
    public String solve() {
        int n = 0;
        int seq, maxSeq = 0;

        numSeq[1] = 1; // collatz sequence of one
        for (int i = 1; i < LIMIT; i++) {
            seq = collatzSeq(i);
            if (seq > maxSeq) {
                maxSeq = seq;
                n = i;
            }
        }
        return Integer.toString(n);
    }

    private int collatzSeq(int x) {
        BigInteger n = BigInteger.valueOf(x);
        int count;

        for (count=1; !n.equals(BigInteger.ONE); count++){
            if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
                n = n.divide(BigInteger.valueOf(2));
            else
                n = n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            if (n.compareTo(BigInteger.valueOf(x)) < 0) {
                count += numSeq[n.intValue()-1];
                break;
            }
        }
        numSeq[x-1] = count;
        return count;
    }
}
