# 206. Reverse Linked List

**Difficulty:** Easy | **Technique:** Linked List (Iterative Pointer Reversal)
**Time:** O(n) | **Space:** O(1)

## Approach

Use three pointers: prev (initially null), curr (initially head), and next. At each step, store curr.next in next, point curr.next back to prev, then advance prev to curr and curr to next. When curr becomes null, prev is the head of the reversed list.

## Key Insight

The link must be reversed only after saving the next node, otherwise the remainder of the list becomes unreachable. This pointer-flipping pattern is a building block for harder linked list problems such as reversing in groups, checking palindromes, and reordering lists.
