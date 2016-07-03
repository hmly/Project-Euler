/**
 * Created by hmly on 7/2/16.
 *
 * Problem 1: Multiples of 3 and 5
 * Answer: 233168
 */
public class p001 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p001().solve());
    }

    @Override
    public String solve() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return Integer.toString(sum);
    }
}
