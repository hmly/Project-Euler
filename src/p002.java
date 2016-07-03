/**
 * Created by hmly on 7/2/16.
 *
 * Problem 2: Even Fibonacci numbers
 * Answer: 4613732
 */
public class p002 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p002().solve());
    }

    @Override
    public String solve() {
        int sum = 0;
        int i, j = 1, k = 2;
        while (j < 4000000) {
            if (j % 2 == 0)
                sum += j;
            i = k;
            k += j;
            j = i;
        }
        return Integer.toString(sum);
    }
}
