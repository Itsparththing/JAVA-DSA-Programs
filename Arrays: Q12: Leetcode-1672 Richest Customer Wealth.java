
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
