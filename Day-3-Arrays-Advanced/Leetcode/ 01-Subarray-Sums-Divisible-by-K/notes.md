
### `02-Subarray-Sums-Divisible-by-K/notes.md`

```markdown
# LeetCode 974 - Subarray Sums Divisible by K

## Pattern
Prefix Sum + HashMap + Modulo

## Key Idea
If two prefix sums have the same remainder when divided by `k`,
their difference is divisible by `k`.

```text
prefix[i] % k == prefix[j] % k
