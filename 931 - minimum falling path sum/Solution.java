class Solution {
    int mat[][], n, intMx = Integer.MAX_VALUE, min = intMx;
    int minSumAt[][];
    public int minFallingPathSum(int[][] mat) {
        this.mat = mat;
        this.n = mat.length;
        this.minSumAt = new int[n][n];
        for (int[] arr : minSumAt)
            Arrays.fill(arr, intMx);
        for (int i = 0; i < n; i++) {
            min = Math.min(min, recurse(0, i));
        }
        return min;
    }

    int recurse(int i, int j) {
        // base
        if (i == n - 1) return mat[i][j];
        // DP resolver
        if (minSumAt[i][j] != intMx) return minSumAt[i][j];
        // recurse
        int leftDig = intMx, down = intMx, rightDig = intMx;
        if (i + 1 < n && j - 1 >= 0) leftDig = mat[i][j] + recurse(i + 1, j - 1);
        if (i + 1 < n) down = mat[i][j] + recurse(i + 1, j);
        if (i + 1 < n && j + 1 < n) rightDig = mat[i][j] + recurse(i + 1, j + 1);
        return minSumAt[i][j] = Math.min(leftDig, Math.min(down, rightDig));
    }
}