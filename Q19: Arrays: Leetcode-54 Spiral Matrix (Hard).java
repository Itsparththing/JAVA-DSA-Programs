class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

       int rows = matrix.length;
       int cols = matrix[0].length;
       List<Integer> ans= new ArrayList<Integer>();

       int startRow=0;
       int endRow = rows -1;
       int startCol =0;
       int endCol= cols-1;

       while(startRow<=endRow && startCol<= endCol){
           // for startRowmost row
            for (int i=startCol; i<=endCol; i++){
                ans.add(matrix[startRow][i]);
            }
            // for endCol col
            for (int i = startRow+1; i<=endRow;i++){
                ans.add(matrix[i][endCol]);
            }
            if (startRow < endRow && startCol < endCol) {
                for(int i=endCol-1; i>=startCol;i--){
                    ans.add(matrix[endRow][i]);
                }
                for(int i=endRow-1; i>startRow; i--){
                    ans.add(matrix[i][startCol]);
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
            
       }
       return ans;

    }
}
