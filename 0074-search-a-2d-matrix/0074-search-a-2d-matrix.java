class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
           for (int i = 0; i < matrix.length; i++) {
            
            int cols = matrix[i].length;

            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }}
            return false;
    }
}