package src;

import java.io.*;
import java.util.*;
import java.math.*;

public class Problem013 {
    public static String answer() throws FileNotFoundException {
        BigInteger sum = BigInteger.valueOf(0);
        Scanner scan = new Scanner(new File("data.txt"));
        while (scan.hasNext()) {
            BigInteger number = new BigInteger(scan.nextLine());
            sum = sum.add(number);
        }
        return sum.toString().substring(0, 10);
    }
}