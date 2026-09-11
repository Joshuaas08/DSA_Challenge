class Solution {
    public int minSubarray(int[] nums, int p) {

        // Find total remainder
        long totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int target = (int)(totalSum % p);

        // Already divisible
        if (target == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 before the array starts
        map.put(0, -1);

        long prefixSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int remainder = (int)(prefixSum % p);

            // Remainder we need to find
            int required = (remainder - target + p) % p;

            if (map.containsKey(required)) {
                int previousIndex = map.get(required);

                minLength = Math.min(
                    minLength,
                    i - previousIndex
                );
            }

            // Store latest index
            map.put(remainder, i);
        }

        // Cannot remove the entire array
        return minLength == nums.length ? -1 : minLength;
    }
}
