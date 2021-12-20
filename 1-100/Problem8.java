import java.util.*;
import java.io.*;

public class Problem8 {
    public static long answer() throws FileNotFoundException {
        String number = "";
        Scanner scan = new Scanner(new File("data.txt"));
        while (scan.hasNextLine()) {
            number += scan.nextLine();
        }

        long largestProduct = 0;
        for (int i = 0; i < number.length() - 12; i++) {
            long product = 1;
            for (int j = 0; j <= 12; j++) {
                product *= Character.getNumericValue(number.charAt((i + j)));
            }
            if (product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }
}