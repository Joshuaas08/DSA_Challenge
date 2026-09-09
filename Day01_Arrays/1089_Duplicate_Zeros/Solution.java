class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;

        // Count the number of zeros that will be duplicated
        int zeros = 0;

        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        // Start from the end
        int i = n - 1;
        int j = n + zeros - 1;

        while (i >= 0) {

            // Only write if j is inside the array
            if (j < n) {
                arr[j] = arr[i];
            }
            j--;

            // If current element is zero, duplicate it
            if (arr[i] == 0) {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
            }

            i--;
        }
    }

