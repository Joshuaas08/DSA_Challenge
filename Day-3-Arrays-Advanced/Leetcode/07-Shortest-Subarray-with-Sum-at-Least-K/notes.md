### `07-Shortest-Subarray-with-Sum-at-Least-K/notes.md`

```markdown
# LeetCode 862 - Shortest Subarray with Sum at Least K

## Pattern
Prefix Sum + Monotonic Deque

## Key Idea
Create prefix sums:

```text
subarraySum = prefix[i] - prefix[j]
