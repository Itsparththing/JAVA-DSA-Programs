// My solution 
// Time Complexity:- O(n)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1; 
        result[1] = -1;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                result[1] = j;
                break;
            }
        } 
        return result;
    }
}


// Optimised Solution
// Time Complexity:- O(Log(n)) 

import java.util.Arrays;

public class firstandlastindexoftarge {
    public static void main(String[] args) {
        int nums[]= {1,4,5,5,5,6,7,9,12};
        int target = 5;
        int []ans ={-1,-1};
        int start =search(nums, target, true);
        int end =search(nums, target, false);
        ans[0]=start;
        ans[1]=end;

        System.out.println(Arrays.toString(ans));
    }
    
    static int search(int[] arr, int target, boolean finStartIndex){
        int ans = -1;
        int start =0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[arr.length-1]){
                return -1;
            }
            if(target<arr[mid]){
                end = mid-1;

            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                ans = mid;
                if(finStartIndex==true){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }

            }
        }
        return ans;
    }
}


