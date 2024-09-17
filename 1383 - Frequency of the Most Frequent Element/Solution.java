class Solution {
    public int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        int i = 0, j = 0, n = arr.length, maxLen = 0;
        long currSum = 0; // Use long to prevent overflow

        while (j < n) {
            currSum += arr[j]; // Add current element to the sum

            // Calculate the difference to check if we can make all elements equal to arr[j]
            long rem = (long)arr[j] * (j - i + 1) - currSum;

            // If the window is invalid, shrink it from the left
            while (rem > k && i <= j) {
                currSum -= arr[i]; // Remove element arr[i] from the sum
                i++; // Move left pointer
                rem = (long)arr[j] * (j - i + 1) - currSum; // Recalculate rem based on new window
            }

            // Update the maximum length of the valid window
            maxLen = Math.max(maxLen, j - i + 1);
            j++; // Move right pointer to expand the window
        }
        return maxLen; // Return the maximum frequency of equal elements we can achieve
    }
}