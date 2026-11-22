# 121. Best Time to Buy and Sell Stock

Difficulty: Easy | Technique: Greedy (One-Pass)
Time: O(n) | Space: O(1)

## Approach

Scan the prices once while tracking the lowest price seen so far (buy). For each day, if the price is lower than buy, update buy. Otherwise, compute the profit of selling on that day and update the maximum profit if it is larger.

## Key Insight

For any selling day, the best buying day is the cheapest day before it, so there is no need to compare every pair of days. Keeping a running minimum while scanning left to right also guarantees that the buy always happens before the sell. This reduces the brute force `O(n²)` solution to a single `O(n)` pass.
