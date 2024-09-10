class Solution {
    public int uniquePaths(int m, int n) {
        int waysTill[][] = new int[m][n];
        return findPaths(0, 0, m, n, waysTill);
    }

    public int findPaths(int i, int j, int m, int n, int waysTill[][]) {
        // base
        if (i >= m || j >= n) return 0;
        if (i == m - 1 && j == n - 1) return 1;
        // recurse
        if (waysTill[i][j] != 0) return waysTill[i][j];
        return waysTill[i][j] = findPaths(i + 1, j, m, n, waysTill) + findPaths(i, j + 1, m, n, waysTill);
    }
}


/*
Recursive approach: 
recurse(i, j, m, n) {
    if (atDestination) return 1; // you found one path
    if (outOfBound) return 0; // this is invalid path
    goLeft = recurse(i, j + 1, m, n);
    goDown = recurse(i + 1, j, m, n);
    return goLeft + goDown;
}
*/