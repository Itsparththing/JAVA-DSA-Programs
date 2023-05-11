
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dsum =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int j=0; j<nums.length; j++){
            while(nums[j] > 0){
                int digit = nums[j] % 10;
                dsum += digit;
                nums[j] /= 10;
            }
        }
        return sum - dsum;   
    }   
}
