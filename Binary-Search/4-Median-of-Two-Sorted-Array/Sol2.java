class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] k = new int[nums1.length + nums2.length];
        int kIndex = 0;

        // merge step
        while( i < n1 && j < n2 ){

            if( nums1[i] < nums2[j] ) {
                k[kIndex++] = nums1[i];
                i++;
            }else {
                k[kIndex++] = nums2[j];
                j++;
            }
        }

        while (i < n1) {
            k[kIndex++] = nums1[i];
            i++;
        }

        while (j < n2) {
            k[kIndex++] = nums2[j];
            j++;
        }
        //median
    double median = 0;
    int c = k.length;
    int e = k.length - 1;

     if(c % 2 == 0){
        median = ( (k[e/2] + k[(e/2) + 1]) / 2.0);
     } else {
        median = k[(e/2)] ;
     }
    return median;
    }
}