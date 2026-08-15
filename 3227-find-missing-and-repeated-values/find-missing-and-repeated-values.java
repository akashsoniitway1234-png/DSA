class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long N = n * n; // Total numbers

        long sn = (N * (N + 1)) / 2;
        long s2n = (N * (N + 1) * (2 * N + 1)) / 6;

        long s = 0;
        long s2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s += grid[i][j];
                s2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long val1 = s - sn;     // repeated - missing
        long val2 = s2 - s2n;   // repeated² - missing²

        val2 = val2 / val1;     // repeated + missing

        long repeated = (val1 + val2) / 2;
        long missing = repeated - val1;

        return new int[]{(int) repeated, (int) missing};
    }
}