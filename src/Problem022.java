package src;

import java.io.*;
import java.util.*;

public class Problem022 {

    public static int answer() throws FileNotFoundException {
        List<String> names = new ArrayList<>();
        Scanner scan = new Scanner(new File("data.txt"));
        while (scan.hasNext()) {
            for (String s : scan.next().split(",")) {
                names.add(s.substring(1, s.length() - 1));
            }
        }
        Collections.sort(names);

        int sum = 0;
        for (int i = 0; i < names.size(); i++) {
            int nameSum = 0;
            for (int j = 0; j < names.get(i).length(); j++) {
                nameSum += (names.get(i).charAt(j) - 64);
            }
            sum += nameSum * (i + 1);
        }
        return sum;
    }
}