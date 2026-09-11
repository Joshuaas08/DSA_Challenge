# LeetCode 152 - Maximum Product Subarray

## Pattern
Dynamic Programming / Kadane's Algorithm

## Key Idea
Track both the maximum and minimum product ending at the current index.

Why?
A negative number can turn the minimum product into the maximum.

- `maxProd` → maximum product so far
- `minProd` → minimum product so far

If current number is negative, swap `maxProd` and `minProd`.

## Formula

maxProd = max(num, maxProd * num)
minProd = min(num, minProd * num)
