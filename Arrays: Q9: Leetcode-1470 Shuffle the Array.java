
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
        int x =0;
        for(int i =0; i<nums.length; i++){
            if(i%2==0){
                ans[i] = nums[x];
                x++;
            }
            else{
                ans[i]= nums[n];
                n++;
            }
        }
        return ans;
    }
}
