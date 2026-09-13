# 3914. Minimum Operations to Make Array Non-Decreasing

**Difficulty:** Medium | **Technique:** Greedy Peak-Valley / One-Pass Scan
**Time:** O(n) | **Space:** O(1)

# Approach

Rather than simulating subarray increments directly, scan the array once and track contiguous falling segments `(mountain ranges)`. For each falling segment, maintain a running peak and record the maximum drop observed from that peak. Add this drop to a running total whenever a new rising element signals the end of a falling segment.

# Key Insight

Subarray increment operations preserve the relative order of elements, so the minimum number of operations needed to fix any single falling segment is simply the difference between its peak and its lowest valley. This insight avoids the need to simulate individual updates, reducing the problem to a single linear pass.