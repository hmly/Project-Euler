/**
 * Created by hmly on 7/3/16.
 *
 * Problem 6: Sum square difference
 * Answer: 25164150
 */
public class p006 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p006().solve());
    }

    @Override
    public String solve() {
        int sumOfSq = 0;
        int sqOfSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSq += i * i;
            sqOfSum += i;
        }
        return Integer.toString(sqOfSum * sqOfSum - sumOfSq);
    }
}
