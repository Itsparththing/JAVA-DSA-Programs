
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double output;
     
        int [] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3 ,nums1.length , nums2.length);
        Arrays.sort(nums3);
        
        if(nums3.length %2 ==0){
            output = (nums3[(nums3.length)/2] + nums3[(nums3.length -1)/2]) / 2d;
        }
        else{
            output = nums3[(nums3.length)/2] ;
        } 
        return output;
    }
}
