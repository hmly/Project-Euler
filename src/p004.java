/**
 * Created by hmly on 7/2/16.
 *
 * Problem 4: Largest palindrome product
 * Answer: 906609
 */
public class p004 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p004().solve());
    }

    @Override
    public String solve() {
        final int MAX = 1000;
        int x, maxPalin = 0;

        for (int i = 1; i < MAX; i++) {
            for (int j = 1; j < MAX; j++) {
                x = i * j;
                if (isPalindrome(i * j) && x > maxPalin)
                    maxPalin = x;
            }
        }
        return Integer.toString(maxPalin);
    }

    private boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
