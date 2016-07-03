import java.math.BigInteger;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 16: Power digit sum
 * Answer: 1366
 */
public class p016 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p016().solve());
    }

    @Override
    public String solve() {
        String num = BigInteger.valueOf(2).pow(1000).toString();
        int sum = 0;

        for (int i = 0; i < num.length(); i++)
            sum += num.charAt(i) - '0';
        return Integer.toString(sum);
    }
}
