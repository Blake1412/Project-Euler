public class Problem15 {
    public static long answer() {
        long[][] grid = new long[21][21];
        for (int i = 0; i < grid.length; i++) {
            grid[i][0] = 1;
            grid[0][i] = 1;
        }

        for (int i = 1; i < grid.length; i++) {
            grid[i][i] = grid[i][i - 1] + grid[i - 1][i];
            for (int j = i + 1; j < grid.length; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
            }
        }
        return grid[grid.length - 1][grid.length - 1];
    }
}