import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hmly on 7/4/16.
 *
 * Problem 67: Maximum path sum II
 * Answer: 7273
 */
public class p067 implements Euler {

    private static List<List<Integer>> triangle = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new p067().solve());
    }

    @Override
    public String solve() {
        String path = "data/p067_triangle.txt";

        // Convert text to 2d array
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                List<Integer> row = new ArrayList<>();
                for (String x : line.split("\\s"))
                    row.add(Integer.parseInt(x));
                triangle.add(row);
            }

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        // Find maximum total from top to bottom
        for (int i = triangle.size()-2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++)
                triangle.get(i).set(j, triangle.get(i).get(j) +
                        Math.max(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
        }
        return triangle.get(0).get(0).toString();
    }
}
