# 141. Linked List Cycle

**Difficulty:** Easy | **Technique:** Floyd's Cycle Detection (Tortoise and Hare)
**Time:** O(n) | **Space:** O(1)

## Approach

Start two pointers at the head. Move `slow` one node at a time and `fast` two nodes at a time. If `fast` or `fast.next` becomes null, the list ends and there is no cycle. If `slow` and `fast` ever point to the same node, a cycle exists.

## Key Insight

Inside a cycle, the fast pointer gains one step on the slow pointer per iteration, so it must eventually catch up. A hash set of visited nodes also works, but it costs O(n) space, while this approach uses `O(1)`.
