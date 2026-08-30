# 33. Search in Rotated Sorted Array
**Difficulty:** Medium | **Technique:** Binary Search
**Time:** O(log n) | **Space:** O(1)

## Approach
Apply binary search directly on the rotated array without sorting it first. At each step, determine which half (left or right of mid) is sorted, then check if the target lies within that sorted half — if it does, search there; otherwise, search the other half.

## Key Insight
My initial instinct was to sort the array first, but that defeats the purpose of an O(log n) solution. The real insight is that at every point, at least one half of the rotated array is already sorted — correctly identifying that half at each step lets binary search work directly on the rotated array, avoiding the need to "unrotate" it.