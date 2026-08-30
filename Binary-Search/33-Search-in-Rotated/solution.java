public class solution {

  public int search(int[] nums, int target){
    int st = 0;
    int end = nums.length - 1;


    while(st <=end){
      int mid = st + (end - st) / 2;
      if(nums[mid] == target){
        return mid;
      }


      //Left half is sorted
      if(nums[st] <= nums[mid]){
         if(nums[st] <= target && target < nums[mid]){
           end = mid - 1 ;
         }else {
           st = mid + 1;
      }
      }

      //Right half is sorted
      else{
        if(nums[mid] < target && target <= nums[end]){
          st = mid + 1;
        }else{
          end = mid - 1;
        }
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    solution s = new solution();
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    System.out.println(s.search(nums,target));
  }

}
