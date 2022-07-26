class Solution {
    
     static void rotate90clockwise(int mat[][])
    {
         int n=mat.length;
        // Transpose of matrix
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
 
        // Reverse individual rows
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int t = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = t;
                low++;
                high--;
            }
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
       /* int n=mat.length;
        // Transpose of matrix
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
 
        // Reverse individual rows
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int t = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = t;
                low++;
                high--;
            }
        }
        if (mat[i][j]=target[i][j]){
            return true;
        }
        else{
            return false;}
            
        
    }
}*/

for (int i = 0; i < 4; ++i) { // rotate 0, 1, 2, 3 times.
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate90clockwise(mat);
        }
        return false;
    }
}