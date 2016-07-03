/**
 * Created by hmly on 7/2/16.
 *
 * Problem 3: Largest prime factor
 * Answer: 6857
 */
public class p003 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p003().solve());
    }

    @Override
    public String solve() {
        long x = 600851475143L;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                x /= i;
        }
        return Long.toString(x);
    }
}
