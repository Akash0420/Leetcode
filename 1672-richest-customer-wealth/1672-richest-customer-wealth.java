class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int rich= -1;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
        for(int j=0;j<accounts[0].length;j++){
            sum+=accounts[i][j];
    }

         rich = Math.max(sum, rich);
}
        return rich;
    }
}