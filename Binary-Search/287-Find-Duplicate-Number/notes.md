# 287. Find the Duplicate Number

**Difficulty:** Medium | **Technique:** Binary Search (Answer Range).
**Time:** O(n log n) | **Space:** O(1)

## Approach

Instead of performing binary search on the array indices, perform binary search on the **range of possible duplicate values**, which is `1` to `n`. For each `mid`, count how many elements in `nums` are less than or equal to `mid`. If `count > mid`, then there are more elements in the range `1...mid` than the number of distinct values possible in that range. By the **Pigeonhole Principle**, the duplicate must lie in `1...mid`, so move `high = mid`. Otherwise, the duplicate must lie in `mid + 1...n`, so move `low = mid + 1`. Continue until `low == high`. This remaining value is the duplicate number.

## Key Insight

Binary Search does not have to be applied to array indices. It can be applied to the **range of possible answers** when a monotonic condition can divide that range into two parts.
In this Approach,`low`, `high`, and `mid` represent **possible values**, not array indices.
