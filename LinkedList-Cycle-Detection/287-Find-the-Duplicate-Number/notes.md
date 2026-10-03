# 287. Find the Duplicate Number

**Difficulty:** Medium | **Technique:** Floyd's Cycle Detection (Tortoise and Hare)
**Time:** O(n) | **Space:** O(1)

## Approach

Treat the array as an implicit linked list, where nums[i] points to the "next" index. Since a value repeats, at least two indices point to the same location, which guarantees a cycle exists in this implicit structure. Use a slow pointer (moves one step) and a fast pointer (moves two steps) until they meet inside the cycle. Then reset the slow pointer to the start, and move both pointers one step at a time — the point where they meet again is the start of the cycle, which corresponds to the duplicate number. Because every value lies between `1` and `n`, following these pointers eventually creates a cycle. The duplicate number acts as the **entry point of the cycle**. First, make both pointers meet inside the cycle. Then reset one pointer to the starting position and move both pointers one step at a time. The point where they meet again is the duplicate number.

## Key Insight

This problem is a disguised version of the Linked List Cycle II problem — the constraint "no modification, O(1) space" rules out sorting, a frequency map, or a visited-set approach, all of which would otherwise be the obvious first instinct. Recognizing that repeated values in a bounded-range array create a cycle is the key leap that unlocks Floyd's algorithm here.
