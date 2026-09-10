
### Approach
Compare `nums[mid]` with `nums[mid + 1]`.

- If `nums[mid] < nums[mid + 1]` → move right.
- Otherwise → move left, including `mid`.

- Binary Search can be used to find a peak based on the direction of the array
