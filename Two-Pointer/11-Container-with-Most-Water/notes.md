# 11. Container With Most Water

**Difficulty:** Medium | **Technique:** Two Pointers
**Time:** O(n) | **Space:** O(1)

# Approach

Place two pointers at the start and end of the array. At each step, calculate the area as the width between the pointers multiplied by the shorter of the two heights, then track the maximum area seen. Move the pointer at the shorter height inward, since that side is the limiting factor.

# Key Insight

The shorter line always caps the water level, so keeping it in place while shrinking the width can never increase the area. Moving the shorter pointer inward is the only move that could potentially find a taller line and yield a larger area, this greedy choice guarantees the optimal answer is found in a single O(n) pass.