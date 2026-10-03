# 239. Sliding Window Maximum

**Difficulty:** Hard | **Technique:** Array as Deque
**Time:** O(n) | **Space:** O(n)

## Approach

Maintain a deque that stores indices, kept in decreasing order of their corresponding values. For each new element: Remove indices from the front of the deque if they've fallen outside the current window. Remove indices from the back of the deque if their values are smaller than or equal to the current element — they can never become the window's maximum while a larger, more recent element is still in range. Add the current index to the back. Once the window has reached size k, the front of the deque always holds the index of the current window's maximum.

## Key Insight

Each element is added and removed from the deque at most once, giving an overall O(n) time complexity despite the nested-looking while loops — this is an amortized analysis, not a true nested loop.
