class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        List<Integer> lucky= new ArrayList<>();
        
        for(int i=0;i<m;i++){
            int minIndex=0;
            int min= Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isT = true;
            for(int j=0;j<m;j++){
                if(matrix[i][minIndex]<matrix[j][minIndex]){
                    isT=false;
                    break;
                }
                
        }
        if(isT){
            lucky.add(matrix[i][minIndex]);
        }
            
    }
        return lucky;
}
}    