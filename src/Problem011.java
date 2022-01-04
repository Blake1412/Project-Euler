package src;

import java.io.*;
import java.util.*;

public class Problem011 {
    public static int answer() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("data.txt"));
        String[][] grid = new String[20][20];
        while (scan.hasNextLine()) {
            for (int i = 0; i < 20; i++) {
                grid[i] = scan.nextLine().split(" ");
            }
        }

        int product = 1, largestProduct = 0;
        for (int i = 0; i < grid.length; i++) { // Verticals
            for (int j = 0; j < grid.length - 3; j++) {
                for (int k = 0; k < 4; k++) {
                    product *= Integer.valueOf(grid[j + k][i]);
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        for (int i = 0; i < grid.length; i++) { // Horizontals
            for (int j = 0; j < grid.length - 3; j++) {
                for (int k = 0; k < 4; k++) {
                    product *= Integer.valueOf(grid[i][j + k]);
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        for (int i = 0; i < grid.length - 3; i++) { // Forward Diagonals
            for (int j = 0; j < grid.length - 3; j++) {
                for (int k = 0; k < 4; k++) {
                    product *= Integer.valueOf(grid[i + k][j + k]);
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        for (int i = 0; i < grid.length - 3; i++) { // Backwards Diagonals
            for (int j = grid.length - 1; j > 2; j--) {
                for (int k = 0; k < 4; k++) {
                    product *= Integer.valueOf(grid[i + k][j - k]);
                }
                if (product > largestProduct) {
                    largestProduct = product;
                }
                product = 1;
            }
        }
        return largestProduct;
    }
}
