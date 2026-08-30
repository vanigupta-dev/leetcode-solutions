class java{

public int serach(int[] nums, int target){
  int st = 0;
  int end =  nums.length - 1;

  while(st <= end){
    int mid = st + (end - st ) / 2;
    if(nums[mid] == target){
      return mid;
    } else if (nums[mid] < target){
      st = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return -1;
}

  public static void main(String[] args) {
    int nums[] = {-1,0,3,5,9,12};
    int target = 9;
    java obj = new java();
    System.out.println(obj.serach(nums, target));
  }
}