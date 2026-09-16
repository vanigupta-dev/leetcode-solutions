# 51. N-Queens

**Difficulty:** Hard | **Technique:** Backtracking
**Time:** O(n!) | **Space:** O(n)

## Approach

Place queens one row at a time. For each row, try every column and check if placing a queen there is safe — no other queen shares the same column, and no other queen lies on the same diagonal. If a column is safe, place the queen and recurse to the next row; if a full board is reached (all rows filled), record it as a valid solution. If no column works, backtrack to the previous row and try a different placement.

## Key Insight

Since queens are placed one per row, only column and diagonal conflicts need to be checked — row conflicts are impossible by construction. Two queens share a diagonal exactly when the absolute difference between their row indices equals the absolute difference between their column indices `(|row1 - row2| == |col1 - col2|)`, which gives an O(n) safety check per placement without needing to track diagonals separately
