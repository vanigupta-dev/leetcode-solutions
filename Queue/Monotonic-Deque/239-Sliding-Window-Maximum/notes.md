# 239. Sliding Window Maximum

**Difficulty:** Hard | **Technique:** Monotonic Deque
**Time:** O(n) | **Space:** O(k)

## Approach

Maintain a deque that stores indices, kept in decreasing order of their corresponding values. For each new element: Remove indices from the front of the deque if they've fallen outside the current window. Remove indices from the back of the deque if their values are smaller than or equal to the current element — they can never become the window's maximum while a larger, more recent element is still in range. Add the current index to the back. Once the window has reached size k, the front of the deque always holds the index of the current window's maximum.

## Key Insight

Each element is added and removed from the deque at most once, giving an overall O(n) time complexity despite the nested-looking while loops — this is an amortized analysis, not a true nested loop.The array-based version uses more space (an array sized to the full input rather than just k), but runs faster in practice — likely due to avoiding the overhead of Java's ArrayDeque object operations (boxing/unboxing, internal resizing checks).

## Two Implementations Compared

**Implementation**	   |   **Space**  |  **Runtime**	 |   **Notes**
Manual array as deque  |   O(n)	      |   10ms	       |   Avoids object overhead; front/back tracked with raw indices.
java.util.ArrayDeque	 |   O(k)	      |   29ms	       |   Cleaner, more idiomatic Java; uses built-in queue operations.
