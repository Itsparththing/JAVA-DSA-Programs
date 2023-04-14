# JAVA + DSA Programs
Solution of every problem that I have solved.

## Topic-1: Arrays

Q1 Swapping Values in array

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

Q2 Sinding maximum value in the array

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

Q3 Reversing array elemets

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

Q4 Leetcode-1920 Build Array from Permutation

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

Q5 Leetcode-1929 Concatenation of Array

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

Q6

```java

```

