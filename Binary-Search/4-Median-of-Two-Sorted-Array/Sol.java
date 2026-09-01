class Sol{

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    if (m > n) {
        return findMedianSortedArrays(nums2, nums1);
    }
    int low = 0, high = m;
    while (low <= high) {
      // Partition the arrays
        int partitionX = (low + high) / 2;  //for nums1 left elements
        int partitionY = (m + n + 1) / 2 - partitionX; //for nums2 left elements

        int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
        int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

        int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
        int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

        if (maxLeftX <= minRightY && maxLeftY <= minRightX) { // We have partitioned the arrays correctly
            if ((m + n) % 2 == 0) {
                return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
            } else {
                return Math.max(maxLeftX, maxLeftY);
            }
        } else if (maxLeftX > minRightY) { // we are too far on right side for partitionX. Go on left side.
            high = partitionX - 1;
        } else { // we are too far on left side for partitionX. Go on right side.
            low = partitionX + 1;
        }
    }
    return 0.0;
  }
}