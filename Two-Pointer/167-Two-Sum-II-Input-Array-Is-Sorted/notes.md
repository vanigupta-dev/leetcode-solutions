# 167. Two Sum II - Input Array Is Sorted

**Difficulty:** Medium | **Technique:** Two Pointers + Array
**Time:** O(n) | **Space:** O(1)

# Approach

Place two pointers at the start and end of the sorted array. Calculate the sum of the elements at both pointers — if it matches the target, return the indices (1-indexed). If the sum is too large, move the high pointer left; if too small, move the low pointer right.

# Key Insight

Because the array is already sorted, a two-pointer approach achieves the required O(1) space constraint — unlike the classic Two Sum problem, which relies on a hashmap and uses O(n) space. Sorted input is a strong signal to consider two pointers or binary search before reaching for extra data structures.