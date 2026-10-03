// USING DEQUE
import java.util.ArrayDeque;
import java.util.Deque;

public class sol {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null || nums.length == 0) return new int[0];
    int n = nums.length;
    int[] res = new int[n - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        deque.pollFirst();
      }
      while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
        deque.pollLast();
      }
      deque.offerLast(i);
      if (i >= k - 1) {
        res[i - k + 1] = nums[deque.peekFirst()];
      }
    }
    return res;
  }
}
