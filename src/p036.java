/**
 * Created by hmly on 7/4/16.
 *
 * Problem 36: Double-base palindromes
 * Answer: 872187
 */
public class p036 implements Euler {

    private static final int LIMIT = 1000000;

    public static void main(String[] args) {
        System.out.println(new p036().solve());
    }

    @Override
    public String solve() {
        long sum = 0;
        for (int i = 1; i < LIMIT; i++) {
            if (isBase10Palindrome(i) && isBase2Palindrome(i))
                sum += i;
        }
        return Long.toString(sum);
    }

    private boolean isBase10Palindrome(int n) {
        String s = Integer.toString(n);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    private boolean isBase2Palindrome(int n) {
        String s = Integer.toBinaryString(n);
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
