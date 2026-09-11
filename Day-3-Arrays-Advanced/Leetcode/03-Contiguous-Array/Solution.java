class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before we start
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            // Convert 0 to -1
            if (nums[i] == 0) {
                prefixSum--;
            } else {
                prefixSum++;
            }

            // If we've seen this prefix sum before
            if (map.containsKey(prefixSum)) {

                int previousIndex = map.get(prefixSum);

                maxLength = Math.max(
                    maxLength,
                    i - previousIndex
                );

            } else {
                // Store only the FIRST occurrence
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
