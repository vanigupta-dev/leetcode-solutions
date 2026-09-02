class sol1{

  public int findDuplicate(int[] nums) {

    int n = nums.length - 1;
    int low = 1;
    int high = n;

    while (low < high) {

      // The constraints have n <= 10^6, so: high <= 1,000,000 & low >= 1 Therefore->
      // low + high <= 2,000,000
      // Hence there is no realistic integer overflow issue.
      int mid = (low + high) / 2;
      int count = 0;

      for (int i = 0; i < nums.length; i++) {
        if (nums[i] <= mid) {
          count++;
        }
      }
      if (count > mid) {
        high = mid;
      } else {
        low = mid + 1;
      }

    }
    return low;
  }

}
