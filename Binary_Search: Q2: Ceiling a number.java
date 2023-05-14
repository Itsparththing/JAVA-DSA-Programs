public class Cieling_floor {
    public static void main(String[] args) {
        int [] arr = new int []{1,5,7,9,13,15,17,21};
        int target = 22;
        System.out.println(cieling(arr, target));

    }
    static int cieling(int[] arr, int target){
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
                return mid;
            }

        }
        return start; // to find floor return end
    }
}
