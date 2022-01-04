package src;

import java.io.*;
import java.util.*;

public class Problem018 {
    public static int answer() throws FileNotFoundException {
        List<List<Integer>> triangle = new ArrayList<>();
        Scanner scan = new Scanner(new File("data.txt"));
        while (scan.hasNextLine()) {
            List<Integer> i = new ArrayList<>();
            for (String s : scan.nextLine().split(" ")) {
                i.add(Integer.valueOf(s));
            }
            triangle.add(i);
        }

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.max(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}