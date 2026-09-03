# 977. Squares of a Sorted Array
**Difficulty:** Easy | **Technique:** Two Pointers
**Time:** O(n) | **Space:** O(n)

## Approach
Use two pointers starting at both ends of the array. Compare the absolute values at the left and right pointers — the larger absolute value produces the larger square. Fill the result array from right to left, placing the larger square each time and moving the corresponding pointer inward.

## Key Insight
Since the array can contain negative numbers, the largest squares always come from the elements with the largest absolute values — which sit at either end of a sorted array, not necessarily at the extremes of the original signed values. This avoids the need to square everything and re-sort with `Arrays.sort()`, directly solving the problem's O(n) follow-up.