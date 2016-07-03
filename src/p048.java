import java.math.BigInteger;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 48: Self powers
 * Answer: 9110846700
 */
public class p048 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p048().solve());
    }

    @Override
    public String solve() {
        BigInteger sum = BigInteger.ZERO;
        String num;

        for (int i = 1; i <= 1000; i++)
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        num = sum.toString();

        return num.substring(num.length()-10);
    }
}
