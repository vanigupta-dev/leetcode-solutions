# 2047. Number of Valid Words in a Sentence

**Difficulty:** Easy | **Technique:** String Traversal
**Time:** O(n) | **Space:** O(1)

## Approach

Traverse the sentence character by character, validating each token using a small set of tracked states. Lowercase letters are treated as valid characters. A digit immediately invalidates the current token. A hyphen is permitted at most once within a token, and only when it has a lowercase letter immediately before and after it. A punctuation mark `(!, ., or ,)` is valid only as the final character of a token. A space, or reaching the end of the sentence, marks the end of the current token — it is counted only if it is both valid and non-empty.

## Key Insight

Two boolean flags are maintained to represent two distinct conditions: valid tracks whether the current token satisfies all formatting rules, while hasChar tracks whether a token contains any characters at all. This distinction is necessary to correctly handle cases where multiple consecutive spaces appear between words — without hasChar, the gap between such spaces could be mistakenly counted as a valid token.
