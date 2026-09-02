# 287. Find the Duplicate Number

**Difficulty:** Medium | **Technique:** Binary Search (Answer Range) / Cycle Detection (Floyd's Algorithm)

Approach 1: **Time:** O(n log n) | **Space:** O(1)

Approach 2: **Time:** O(n) | **Space:** O(1)

### Approach 1 — Binary Search on Answer Range

Instead of performing binary search on the array indices, perform binary search on the **range of possible duplicate values**, which is `1` to `n`.

For each `mid`, count how many elements in `nums` are less than or equal to `mid`.

If `count > mid`, then there are more elements in the range `1...mid` than the number of distinct values possible in that range. By the **Pigeonhole Principle**, the duplicate must lie in `1...mid`, so move `high = mid`.

Otherwise, the duplicate must lie in `mid + 1...n`, so move `low = mid + 1`.

Continue until `low == high`. This remaining value is the duplicate number.

### Approach 2 — Optimized Cycle Detection

Treat the array like a linked list where each index points to the value stored at that index:

`index → nums[index]`

Because every value lies between `1` and `n`, following these pointers eventually creates a cycle. The duplicate number acts as the **entry point of the cycle**.

Use **Floyd's Cycle Detection Algorithm (Tortoise and Hare)** with two pointers:

* `slow` moves one step at a time.
* `fast` moves two steps at a time.

First, make both pointers meet inside the cycle. Then reset one pointer to the starting position and move both pointers one step at a time. The point where they meet again is the duplicate number.

This approach achieves O(n) time and O(1) extra space without modifying the array.

### Key Insight

Binary Search does not have to be applied to array indices. It can be applied to the **range of possible answers** when a monotonic condition can divide that range into two parts.

In Approach 1, `low`, `high`, and `mid` represent **possible values**, not array indices.

The optimized Approach 2 uses the same array as a virtual linked list. Since the values are restricted to `1...n`, following `nums[index]` creates a cycle, and the cycle's entry point corresponds to the duplicate number.
