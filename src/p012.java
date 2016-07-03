/**
 * Created by hmly on 7/3/16.
 *
 * Problem 12: Highly divisible triangular number
 * Answer: 76576500
 */
public class p012 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p012().solve());
    }

    @Override
    public String solve() {
        int n = 1;
        int i = 2;
        while (countDivisors(n) < 500) {
            n += i;
            i++;
        }
        return Integer.toString(n);
    }

    private int countDivisors(int x) {
        int limit = (int) Math.sqrt(x);
        int count = limit*limit == x ? 1 : 0; // Account for perfect square

        for (int i = 2; i < limit; i++) {
            if (x % i == 0)
                count += 2;
        }
        return count;
    }
}
