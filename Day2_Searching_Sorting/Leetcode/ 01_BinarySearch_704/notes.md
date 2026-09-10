## Approach
The array is sorted, so instead of checking every element, check the middle
element and eliminate half of the search space each time.

- nums[mid] == target → return mid
- nums[mid] < target → search right
- nums[mid] > target → search left

int mid = left + (right - left) / 2;
