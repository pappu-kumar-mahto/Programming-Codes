/*
We will identify the size of the resulting array and then loop over  the entire length. we will be adding the bigger element that is the larger value first as both the arrays are sorted.
Hence, we will take two pointer, first pointing to the last index of the nums1 and second pointing to the last index of the nums2.
The largest of the two values will be added to the last index of first nums1. repeat the process decreasing the value of the pointer till we have the sorted array.
In the end we will be adding the remaining elements of the array having more elements.
*/

public class merge2SortedArrays2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int len = m + n - 1;
            int endAtNum1 = m - 1;
            int endAtNum2 = n - 1;
            
            while(len >= 0){
                if(endAtNum1 >= 0 && endAtNum2 >= 0){
                    if(nums1[endAtNum1] > nums2[endAtNum2]){
                        nums1[len--] = nums1[endAtNum1--];
                    }
                    else{
                        nums1[len--] = nums2[endAtNum2--];
                    }
                }else if(endAtNum1 >= 0){
                    nums1[len--] = nums1[endAtNum1--];
                }else{
                    nums1[len--] = nums2[endAtNum2--];
                }
            }
        }
}
