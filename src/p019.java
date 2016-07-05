/**
 * Created by hmly on 7/4/16.
 * 
 * Problem 19: Counting Sundays
 * Answer: 171
 */
public class p019 implements Euler {
    
    private static final int[] MONTH = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static void main(String[] args) {
        System.out.println(new p019().solve());
    }

    @Override
    public String solve() {
        int dayOfWeek = 2; // 1-1-1901 falls on a Tuesday
        int sundays = 0;

        for (int y = 1901;  y <= 2000; y++) {
            // Check for leap year
            MONTH[1] = y % 4 == 0 &&
                    (y % 100 != 0 && y % 400 == 0) ? 29 : 28;

            // Check if the first day of each month lands on a Sunday
            for (int m = 0; m < 12; m++) {
                if (dayOfWeek % 7 == 0)
                    sundays++;
                dayOfWeek += MONTH[m];
            }
        }
        return Integer.toString(sundays);
    }
}
