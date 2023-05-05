
// optimised one

class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long [] conver = new long[n];
        long [] ans = new long[n];

        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            conver[i] = nums[i] + max;
            if (i > 0) {
               ans[i] = ans[i - 1] + conver[i];
            } else {
               ans[i] = conver[i];
            }
        }

        return ans;
    }
}


//or


// done by me

class Solution {
    public long[] findPrefixScore(int[] nums) {
        int max = nums[0];
        long [] prefix = new long[nums.length];
        long [] ans = new long[nums.length];
    
        for(int i =0; i<nums.length; i++){
            for(int j =0; j<nums.length; j++){
                if (nums[i]> max){
                    max = nums[i];
                }
                prefix[i] = nums[i]+ max; 
                if (i > 0) {
                    ans[i] = ans[i - 1] + prefix[i];
                } else {
                    ans[i] = prefix[i];
                }
            }
        }
        return ans;
    }
}
