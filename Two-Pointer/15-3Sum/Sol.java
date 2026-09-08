import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Sol{
  public List<List<Integer>> threeSum(int[] nums) {
   List<List<Integer>> result = new ArrayList<>();
  Arrays.sort(nums);
  int n =nums.length;
   int low;
   int high;
   int sum;

  for(int i = 0; i < n; i++) {
    low = i+1;
    high = n-1;

    if(i > 0 && nums[i] == nums[i-1]){
      continue;
    }
   while(low < high){
    sum = nums[i] + nums[low] + nums[high];
    if(sum == 0){
       result.add(new ArrayList<>(Arrays.asList(nums[i], nums[low], nums[high])));
       while(low< high && nums[low] == nums[low+1]){
        low++;
       }
       while(low< high && nums[high] == nums[high-1]){
        high--;
       }
       low++;
       high--;
    }else if(sum > 0){
      high--;
    }else{
      low++;
    }
   }
  }
    return result;
  }
  public static void main(String[] args) {
    Sol s = new Sol();
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> result = s.threeSum(nums);
    System.out.println(result);
  }
}