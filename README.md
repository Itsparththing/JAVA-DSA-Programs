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

Q2

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

Q3

```java

```

Q4

```java

```

Q5

```java

```

Q6

```java

```

