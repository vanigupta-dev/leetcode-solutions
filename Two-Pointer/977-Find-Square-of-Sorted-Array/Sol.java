
class Sol {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] k = new int[n];
        int right = n - 1;
        int left = 0;

        for(int i = right; i > -1 ; i--){


            if(Math.abs(nums[left]) >  Math.abs(nums[right]) ){
             k[i] = (nums[left] * nums[left]);
             left++;

        }

            else{
             k[i] = (nums[right] * nums[right]);
             right--;
            }

        }



    return k;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        int[] nums = {-4,-1,0,3,10};
        int[] result = s.sortedSquares(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
 }
