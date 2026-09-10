### Approach
Sort the array in ascending order. The kth largest element is at:

`nums.length - k`

QuickSelect can improve the average time, but a poor pivot can cause O(n²).

  Convert the kth-largest position into an index after sorting.
