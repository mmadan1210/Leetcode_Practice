class Solution {
    public void rotate(int[][] matrix) {
        
        // Transpose of a matrix
        
        // {1,2,3}
        // {4,5,6}
        // {7,8,9}
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // {1,4,7}
        // {2,5,8}
        // {3,6,9}
        
        // Swapping elements of rows (reversing the row columns)
        
        // {7,4,1}
        // {8,5,2}
        // {9,6,3}
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
        // return matrix;
    }
}