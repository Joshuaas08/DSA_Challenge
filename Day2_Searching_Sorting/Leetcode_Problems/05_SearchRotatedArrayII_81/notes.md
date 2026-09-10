### Approach
Similar to LC 33, but duplicates can make it impossible to identify the
sorted half.

If:

`nums[left] == nums[mid] == nums[right]`

shrink the search space:

`left++` and `right--`

Duplicates can break the normal Binary Search decision, so handle them separately.
