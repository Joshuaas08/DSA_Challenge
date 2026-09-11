### `04-Continuous-Subarray-Sum/notes.md`

```markdown
# LeetCode 523 - Continuous Subarray Sum

## Pattern
Prefix Sum + Modulo + HashMap

## Key Idea
For a subarray to have a sum divisible by `k`:

```text
(prefix[i] - prefix[j]) % k == 0
