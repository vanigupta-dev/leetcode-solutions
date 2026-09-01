# 4. Median of Two Sorted Arrays

**Difficulty:** Hard | **Technique:** Binary Search (Partition)

**Time:** O(log(min(m, n))) | **Space:** O(1)

### Approach

Instead of merging both sorted arrays, perform binary search on the smaller array to find the correct partition. The corresponding partition in the second array is calculated so that the left half contains exactly `(m + n + 1) / 2` elements.

For each partition, compare the boundary elements `left1`, `right1`, `left2`, and `right2`. A valid partition is found when:

`left1 <= right2` and `left2 <= right1`.

For an odd total length, the median is the maximum element on the left. For an even total length, the median is the average of the maximum element on the left and the minimum element on the right.

### Key Insight

The arrays do not need to be physically merged. Since both arrays are sorted, only the elements immediately around the partition are needed to determine whether the partition is correct. Binary searching the smaller array reduces the search to O(log(min(m, n))) time while using O(1) extra space.