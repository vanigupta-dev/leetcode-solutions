class Sol{
 public long minOperations(int[] nums) {
  int n = nums.length;
  long min_x = 0;
  int current_peak = nums[0];
  int max_drop = 0;

  for(int i = 1; i < n; i++){
if(nums[i] < nums[i-1]){
   max_drop = Math.max(max_drop , current_peak - nums[i]);
}else if(nums[i] > nums[i - 1]){
  min_x += max_drop;
  current_peak = nums[i];
  max_drop = 0;
}
  }
 min_x += max_drop;


 return min_x;
 }

 public static void main(String[] args) {
  Sol sol = new Sol();
  int[] nums = {3, 2, 5, 1, 7};
  long result = sol.minOperations(nums);
  System.out.println("Minimum operations: " + result);
 }
}