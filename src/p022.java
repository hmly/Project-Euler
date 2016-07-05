import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by hmly on 7/4/16.
 *
 * Problem 22: Names score
 * Answer: 871198282
 */
public class p022 implements Euler {

    private String[] names;

    public static void main(String args[]) {
        System.out.println(new p022().solve());
    }

    @Override
    public String solve() {
        String path = "data/p022_names.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            int ind, sum = 0;

            // Remove extra quotations from data
            names = line.split("\",\"");
            ind = names.length - 1;
            names[0] = names[0].substring(1, names[0].length());
            names[ind] = names[ind].substring(0, names[ind].length()-1);
            Arrays.sort(names);

            for (int i = 0; i < names.length; i++)
                sum += computeScore(i);

            return Integer.toString(sum);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return null;
    }

    private int computeScore(int i) {
        int score = 0;
        for (int j = 0; j < names[i].length(); j++)
            score += names[i].charAt(j) - 'A' + 1;
        return score * (i + 1);
    }
}
