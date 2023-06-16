class Solution {
    public int[] closestPrimes(int left, int right) {
        int pnum[] =  {-1,-1};
        int min = Integer.MAX_VALUE;
      
        List<Integer> list = new ArrayList<>();
        for(int i = left; i<right; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        if(list.isEmpty()||list.size()<2){
            return pnum;
        }
        for(int i = 1; i<list.size(); i++){
            int temp = list.get(i) - list.get(i-1);
            if (min > temp){
                min = temp;
                pnum[0] = list.get(i-1);
                pnum[1] = list.get(i);
            }
        }
        return pnum;
    }
  
    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
