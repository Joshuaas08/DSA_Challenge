class Solution {

    public int findKthLargest(int[] nums, int k) {

        int target = nums.length - k;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int pivot = nums[left];

            int low = left;
            int mid = left;
            int high = right;

            while (mid <= high) {

                if (nums[mid] < pivot) {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                else if (nums[mid] > pivot) {
                    swap(nums, mid, high);
                    high--;
                }
                else {
                    mid++;
                }
            }

            // target is in the left section
            if (target < low) {
                right = low - 1;
            }

            // target is in the right section
            else if (target > high) {
                left = high + 1;
            }

            // target is inside the equal section
            else {
                return nums[target];
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


