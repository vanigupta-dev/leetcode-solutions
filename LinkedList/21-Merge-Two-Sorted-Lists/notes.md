# 21. Merge Two Sorted Lists

**Difficulty:** Easy | **Technique:** Linked List (Dummy Node)
**Time:** O(m+n) | **Space:** O(1)

## Approach

Create a dummy node to act as a placeholder before the head of the merged list, along with a current pointer starting at the dummy. Compare the current nodes of both lists at each step, linking the smaller one to current.next and advancing that list's pointer. Once one list is exhausted, append the remaining nodes from the other list directly, since they're already sorted.

## Key Insight

Using a dummy node eliminates the need for special-case logic to determine the head of the merged list — without it, you'd need extra conditionals to handle whether list1 or list2 starts as the head. This is a reusable pattern for many linked list problems where the result's head isn't known in advance.
