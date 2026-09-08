class Sol {
  public int[] twoSum(int[] numbers, int target) {
    int low = 0;
    int high = numbers.length - 1;
    int[] k = new int[2];
    while (low < high) {
      int sum = numbers[low] + numbers[high];
      if (sum == target) {
        k[0] = low + 1;
        k[1] = high + 1;
        return k;
      } else if (sum < target) {
        low++;
      } else {
        high--;
      }
    }
    return k;
  }
  public static void main(String[] args) {
    Sol s = new Sol();
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] result = s.twoSum(numbers, target);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
  }
}
