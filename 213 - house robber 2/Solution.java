class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);

        int excludeLast = houseRob(0, n - 2, arr);
        int excludeFirst = houseRob(1, n - 1, arr);
        return Math.max(excludeLast, excludeFirst);
    }

    int houseRob(int l, int r, int arr[]) {
        if (r == l) return arr[r];
        int n = r - l + 1;
        int dp[] = new int[n];
        dp[0] = arr[l];
        dp[1] = Math.max(arr[l + 1], dp[0]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], arr[l + i] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}