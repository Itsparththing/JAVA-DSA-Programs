
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
