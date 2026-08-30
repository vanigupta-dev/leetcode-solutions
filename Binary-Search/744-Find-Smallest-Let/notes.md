# 744. Find Smallest Letter Freater Than Target
**Difficulty:** Easy | **Technique:** Binary Search (Upper Bound)
**Time:** O(log n) | **Space:** O(1)

## Approach
Perform binary search to find the upper bound — the first element strictly greater than the target. Narrow the search space by moving left when the middle element is greater than the target, and right otherwise.

## Key Insight
When the search pointer moves past the last valid index (no element greater than target exists), use the modulo operator `(st % letters.length)` to wrap around and return the first character — this cleanly handles the "no greater element" case without extra conditional logic.

