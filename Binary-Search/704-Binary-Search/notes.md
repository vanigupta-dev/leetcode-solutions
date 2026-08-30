# 704. Binary Search
**Difficulty:** Easy | **Technique:** Binary Search
**Time:** O(log n) | **Space:** O(1)

## Approach
Repeatedly halve the search space by comparing target with the
middle element.

## Key Insight
Used `st + (end - st)/2` instead of `(st+end)/2` to avoid integer overflow.