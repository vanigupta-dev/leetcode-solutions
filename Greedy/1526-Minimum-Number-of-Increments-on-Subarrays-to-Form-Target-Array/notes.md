# 1526. Minimum Number of Increments on Subarrays to Form a Target Array

**Difficulty:** Hard | **Technique:** Greedy
**Time:** O(n) | **Space:** O(1)

## Approach

Start with `target[0]` as the initial operation count. For each subsequent element, `if target[i] is greater than target[i-1]`, the difference represents new subarray operations that must begin at that position. If the value is equal to or smaller than the previous one, no new operations are needed, since existing operations can simply end before the current position.

## Key Insight

Only increases between adjacent elements require new operations — a decrease or plateau means an already-running operation can stop there instead of starting a new one. Summing `target[i] - target[i-1]` whenever it's positive gives the answer directly, avoiding the need to simulate any actual subarray increments.
