# 15. 3Sum

**Difficulty:** Medium | **Technique:** Sorting + Two Pointers
**Time:** O(n²) | **Space:** O(log n)

# Approach

Sort the array, then fix one element at a time and use two pointers (low and high) to search for the remaining two elements whose sum with the fixed element equals zero. Move low forward when the sum is too small, and high backward when the sum is too large.

# Key Insight

The main challenge is avoiding duplicate triplets in the output. Skipping repeated values for the fixed element, as well as for low and high after finding a valid triplet, prevents duplicates while still correctly handling edge cases with repeated numbers, such as `[0,0,0]`.
