import java.util.Arrays;

/**
 * Created by hmly on 7/3/16.
 *
 * Problem 10: Summation of primes
 * Answer: 142913828922
 */
public class p010 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p010().solve());
    }

    @Override
    public String solve() {
        final int LIMIT = 2000000;
        boolean[] primes = new boolean[LIMIT];
        int thld = (int) Math.sqrt(LIMIT);
        int i, j;
        long sum = 0;

        // Apply Sieve of Eratosthenes to the array
        Arrays.fill(primes, true);
        for (i=2; i < thld; i++) {
            if (primes[i]) {
                for (j=i; i*j < LIMIT; j++)
                    primes[i*j] = false;
            }
        }

        // Summation of only indices with a value of true
        for (i=2; i < LIMIT; i++) {
            if (primes[i])
                sum += i;
        }
        return Long.toString(sum);
    }
}
