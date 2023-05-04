
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
