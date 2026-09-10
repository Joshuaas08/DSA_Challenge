### Approach
Compare `nums[mid]` with `nums[right]`.

- If `nums[mid] > nums[right]` → minimum is on the right.
- Otherwise → minimum is at `mid` or on the left.

Binary Search can find a minimum without directly searching for a target.
