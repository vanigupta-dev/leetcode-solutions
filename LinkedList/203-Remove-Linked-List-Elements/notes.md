# 203. Remove Linked List Elements

**Difficulty:** Easy | **Technique:** Linked List (Pointer Traversal)
**Time:** O(n) | **Space:** O(1)

## Approach

First, remove the target value from the head using a while loop. We handle the head separately because it does not have a previous node that we can use to unlink it.

Once the head is valid, initialize `curr = head` and traverse the remaining list. Check `curr.next.val` instead of `curr.val` so that we can remove the next node by updating `curr.next = curr.next.next`.

If a node is removed, do not advance curr, because the next node might also contain the target value. Otherwise, move curr forward.

## Key Insight

We don't need a dummy node because we can handle head removal separately by moving head forward until it points to a node whose value differs from the target. After that, we can traverse the remaining list using curr and remove matching nodes by updating curr.next.

Checking curr.next instead of curr allows us to remove a node without needing a previous pointer. Also, after removing a node, we must not advance curr immediately because consecutive nodes might contain the target value.

`A dummy node is useful when we want to handle head removal and other node removals` using the same logic. However, in this problem, handling the head separately makes the solution straightforward, so creating a dummy node is unnecessary.
