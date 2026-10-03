// ARRAY AS DEQUE

public class sol1 {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null || nums.length == 0) return new int[0];
    int n = nums.length;
    int[] res = new int[n - k + 1];
   int[] deque = new int[n];
    int head = 0, tail = 0;
    for (int i = 0; i < n; i++) {
      while (head < tail && deque[head] < i - k + 1) {
        head++;
      }
      while (head < tail && nums[deque[tail - 1]] < nums[i]) {
        tail--;
      }
      deque[tail++] = i;
      if (i >= k - 1) {
        res[i - k + 1] = nums[deque[head]];
      }
    }
    return res;
  }
}