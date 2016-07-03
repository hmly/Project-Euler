/**
 * Created by hmly on 7/3/16.
 *
 * Problem 9: Special Pythagorean triplet
 * Answer: 31875000
 */
public class p009 implements Euler {

    public static void main(String[] args) {
        System.out.println(new p009().solve());
    }

    @Override
    public String solve() {
        int LIMIT = 1000;
        int b, c;

        for (int a = 1; a < LIMIT; a++) {
            for (b = a + 1; b < LIMIT-a; b++) {
                c = LIMIT - a - b;
                if (a*a + b*b == c*c) // a < b < c
                    return Integer.toString(a * b * c);
            }
        }
        return "Not Found";
    }
}
