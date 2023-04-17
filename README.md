# JAVA + DSA Programs
Solution of every problem that I have solved.

## Topic-1: Arrays

Q1: Swapping Values in array

```java
import java.util.Scanner;
import java.util.Arrays;

public class Arraays {

    public static void main(String[] args) {
        int [] arr = {1,4,5,4,3,6,7};
        swap(arr, 1,5);
        System.out.println(Arrays.toString(arr));
    }
    
    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
```

Q2: Sinding maximum value in the array

```java
public class Arraays {
    public static void main(String[] args) {

        int [] arr = {1,3,5,7,888,45,3};
        int max = max(arr);
        int maxRange = maxRange(arr, 1, 4);
        System.out.println(max);
        System.out.println(maxRange);
    }

    static int max(int[] arr1) {
        int max_val = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max_val) {
                max_val = arr1[i];
            }
        }
        return max_val;
    }
    
    //max in range
    static int maxRange(int[] arr1, int start, int end) {
        int max_val = arr1[0];
        for (int i = start; i < end; i++) {
            if (arr1[i] > max_val) {
                max_val = arr1[i];
            }
        }
        return max_val;
    }
}
```

Q3: Reversing array elemets

```java
import java.util.Arrays;

public class Arraays {
    public static void main(String[] args) {
        int [] arr ={1,5,66,77,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr1) {
        int start =0;
        int end = arr1.length-1 ;

        while(start < end){
            swap(arr1, start, end);
            start++;
            end--;
        }
    }
    
    static void swap (int[] arr2, int index1, int index2){
        int temp = arr2[index1];
        arr2[index1] = arr2[index2];
        arr2[index2] = temp;
    }
}
```

Q4: Leetcode-1920 Build Array from Permutation

```java
class buildarray {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }
}
```

Q5: Leetcode-1929 Concatenation of Array

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
```

Q6: Leetcode-121 Best Time to Buy and Sell Stock

```java
class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int m = 0;
        for (int i = prices.length-1; i>=0; i -- ){
            if (prices[i]>= max ){
                max = prices[i];
            } else {
                m = Math.max(max - prices[i], m);  
            }
        
        }
        return m; 
    }
}
```

Q7: Leetcode-66 Plus One

```java

//optimised Solution

class Solution {
    public int[] plusOne(int[] digits) {
        
        // Reverse iteration of the array
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                //adding one to the digit if its less than 9 starting from th last index
                return digits;
            }
            else
                digits[i] = 0;
                //making lasst index 0 if its 9 then incrementing the prev element
        }

        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}


//or


// done by me

class Solution {
    public int[] plusOne(int[] ar) {

        //aconverting to int from array    
        int res=0;
        for(int i=0;i<ar.length;i++) {
            res=res*10+ar[i];
        }
        
        res = res+1;

        // converting back to array
        String strNumber = res+"";
        int[] array = new int[strNumber.length()];
        int index = 0;
        for(char c : strNumber.toCharArray()){
            array[index++] = Integer.parseInt(c+"");
        }
        return array;     
    }
}
```

Q8: Leetcode-6334 Find the Score of All Prefixes of an Array (weekly Challenge)

```java

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

```

Q9: Leetcode-1470 Shuffle the Array

```java
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
```

Q10: Leetcode-2011 Final Value of Variable After Performing Operations

```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i< operations.length; i++ ){
            if(operations[i].charAt(1)=='+'){
                x++;
            }
            else{
                x--;
            }
           
        }
        return x;
    }
}
```

Q11: Leetcode-1512 Number of Good Pairs

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int x=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    x++;
                }
            }
        }
        return x;
    }
}
```

Q12: Leetcode-1672 Richest Customer Wealth

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxwealth=0;
        for(int i=0; i< accounts.length; i++){
            int wealth =0;
            for(int j=0; j< accounts[i].length; j++){
                wealth = wealth + accounts[i][j];   
            }
            if(wealth> maxwealth){
                maxwealth = wealth; 
            }
        }
        return maxwealth;
    }
}
```

Q13: Leetcode-1480 Running Sum of 1d Array

```java

class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
```

Q14: Leetcode-1431 Kids With the Greatest Number of Candies

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int minval = candies[0];
        ArrayList arr=new ArrayList<>(); 
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > minval) {
                minval = candies[i];
            }
        }    
        for(int j =0; j<candies.length; j++ ){
            if((candies[j]+extraCandies)>=minval){
                arr.add(true);
                }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}
```

Q15: Leetcode-2114 Maximum Number of Words Found in Sentences

```java

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        int max=0;
        String [] sentences = {"How/are/you", "i/am/fine/what/about/you"};
        for (int i = 0; i <sentences.length ; i++) {
            String [] s = sentences[i].split("/");
            int numword= s.length;
            if(numword>max){
                max =numword;
            }
        }
        return max;
    }
}

```

Q16:

```java

```

Q17:

```java

```

Q18:

```java

```

Q19:

```java

```

Q20:

```java

```


