/**
 * Created by hmly on 7/3/16.
 *
 * Problem 17: Number letter counts
 * Answer: 21124
 */
public class p017 implements Euler {

    private static String[] ONES = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"};
    private static String[] TEENS = {"ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};
    private static int LIMIT = 1000;

    public static void main(String[] args) {
        System.out.println(new p017().solve());
    }

    @Override
    public String solve() {
        int sum  = 0;
        for (int i = 1; i <= LIMIT; i++) {
            sum += toEnglish(i).length();
        }
        return Integer.toString(sum);
    }

    private String toEnglish(int n) {
        if (n < 100)
            return tens(n);
        else {
            String result = "";
            if (n >= 1000)
                result += tens(n / 1000) + "thousand";
            if (n / 100 % 10 != 0)
                result += ONES[n / 100 % 10] + "hundred";
            if (n % 100 != 0)
                result += "and" + tens(n % 100);
            return result;
        }
    }

    private String tens(int n) {
        if (n < 10)
            return ONES[n];
        else if (n < 20)
            return TEENS[n - 10];
        else
            return TENS[n / 10 - 2] + (n % 10 != 0 ? ONES[n % 10] : "");
    }
}
