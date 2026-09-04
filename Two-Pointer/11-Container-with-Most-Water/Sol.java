class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n - 1;
        int h;
        int width;


          while(low < high){
            width = high - low;
            h = Math.min(height[low], height[high]);
            area =  width * h;
            max = Math.max(area, max);

       // Move the pointer pointing to the shorter line
        if(height[low] < height[high]){
            low++;
        }else {
            high--;
        }
          }


        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = s.maxArea(height);
        System.out.println(result);
    }
}