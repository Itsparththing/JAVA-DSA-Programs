
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
